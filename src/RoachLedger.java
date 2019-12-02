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
		System.out.println("Creating singleton...");
		RoachMotel rm = RoachMotel.getInstance();
		System.out.println("Attempting checkIn()...");
		MotelRoom temp = rm.checkIn(new RoachColony("Test",100,2), "Deluxe", new ArrayList<String>());
		System.out.println(rm.checkIn(new RoachColony("Test",100,2), "deluxe", new ArrayList<String>()));
		//System.out.println("Room:\n" + temp);
		System.out.println("Attempting passDay()...");
		temp.passDay();
		temp.passDay();
		System.out.println("Attempting checkOut()...");
		rm.checkOut(temp, 2, new RoachPal("test","email"));
		rm.close();
	}
}
