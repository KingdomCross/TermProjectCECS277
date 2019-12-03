import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class RoachLedger {
	
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
	//
	public RoachLedger() {
		try (PrintWriter ledger = new PrintWriter("ledger.txt");) {
			
			ledger.printf("%-30s%-30s%-30s%n", "Name","Payment type","Amount");
		} catch (FileNotFoundException e) {
			System.out.println("Shouldn't be thrown as we are making a new file.");
			e.printStackTrace();
		}
	}
	@Override
	public String toString() {
		return readIn().toString();
		
	}
	
	
	public StringBuilder readIn() {
		try (BufferedReader reader = new BufferedReader(new FileReader(new File("ledger.txt")))){
			StringBuilder buffer = new StringBuilder();
			String temp;
			while( (temp = reader.readLine()) !=null) {
				buffer.append(temp).append("\n");
			}
			
			return buffer;
		}catch (FileNotFoundException e1) {
			System.out.println("Couldn't find ledger.txt in working directory");
			e1.printStackTrace();
			return (new StringBuilder()).append("Error trying to read ledger");
		}	
		catch (IOException e) {
			System.out.println("Io exception when trying to parse ledger");
			e.printStackTrace();
			return (new StringBuilder()).append("Error trying to read ledger");
		} 
	}
	public void payment(Payment payment, double amount) {
		StringBuilder buffer = readIn();
		buffer.append(String.format("%-30s%-30s%-30s%n", payment.getName(),payment.getMethod(),toDollar(amount)));
		try (PrintWriter writer = new PrintWriter(new File("ledger.txt"))){
			writer.write(buffer.toString());
		}catch(Exception e) {
			System.out.println("Error trying to rewrite the ledger");
			e.printStackTrace();
		}
	} 	

	
//	public void close() {
//		ledger.close();
//	}
	
	public static void main(String args[]) {
		System.out.println("Creating singleton...");
		RoachMotel rm = RoachMotel.getInstance();
		System.out.println("Attempting checkIn()...");
		MotelRoom temp = rm.checkIn(new RoachColony("Test",100,2), "Deluxe", new ArrayList<String>());
		MotelRoom temp2 = rm.checkIn(new RoachColony("Test2",100,2), "Deluxe", new ArrayList<String>());
		System.out.println(rm.checkIn(new RoachColony("Test",100,2), "deluxe", new ArrayList<String>()));
		//System.out.println("Room:\n" + temp);
		System.out.println("Attempting passDay()...");
		temp.passDay();
		temp.passDay();
		System.out.println("Attempting checkOut()...");
		rm.checkOut(temp, 2, new RoachPal("test","email"));
		Scanner pause = new Scanner(System.in);
		System.out.println(rm.ledgerToString());
		pause.nextLine();
		rm.checkOut(temp2, 3, new RoachPal("test2","email"));
		System.out.println(rm.ledgerToString());
	}
}
