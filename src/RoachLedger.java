import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

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
			ledger = new PrintWriter(new File(""));
			ledger.printf("%s-30s + %-30s + %-30s", "Name","Payment type","Amount");
		} catch (FileNotFoundException e) {
			System.out.println("Shouldn't be thrown as we are making a new file.");
			e.printStackTrace();
		}
	
	}
	public void masterPayment(MasterRoach pay,double amount) {
		ledger.printf("%s-30s + %-30s + %-30s", pay.getName(),"MasterRoach",toDollar(amount));
		
	}
	public void palPayment(RoachPal pay, double amount) {
		ledger.printf("%s-30s + %-30s + %-30s", pay.getName(),"RoachPal",toDollar(amount));
	}
	public void close() {
		ledger.close();
	}
	public static void main(String args[]) {
		
	}
}
