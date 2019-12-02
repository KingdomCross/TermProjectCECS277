import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class RoachLedger {
	private PrintWriter ledger;
	
	
	
	private static String toDollar(double a) {
		String doub = Double.toString(a);
		if(doub.contains(".")) {
			if(doub.length()-doub.indexOf(".")==3) {
				return "$"+doub;
				
			}else if(doub.length()-doub.indexOf(".")==2) {
				return "$"+doub+"0";
				
			}else{
				return "$"+ doub.substring(0,doub.indexOf(".")+3);
			}
		}else {
			return "$"+doub+".00";
		}
	}
	
	public RoachLedger() {
		try {
			ledger = new PrintWriter("ledger");
			ledger.printf("%s-30s + %-30s + %-30s%n", "Name","Payment type","Amount");
		} catch (FileNotFoundException e) {
			System.out.println("Shouldn't be thrown as we are making a new file.");
			e.printStackTrace();
		}
	
	}
	public void payment(Payment payment, double amount) {
		ledger.printf("%s-30s + %-30s + %-30s%n", payment.getName(),payment.getMethod(),toDollar(amount));
	}
	public void close() {
		ledger.close();
	}
	public static void main(String args[]) {
		RoachMotel rm = RoachMotel.getInstance();
		MotelRoom temp = rm.checkIn(new RoachColony("Test",100,2), "Deluxe", new ArrayList<String>());
		temp.passDay();
		temp.passDay();
		rm.checkOut(temp, 2, new RoachPal("test","email"));
		rm.close();
	}
}
