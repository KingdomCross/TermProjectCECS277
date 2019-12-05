import java.util.ArrayList;

/**
 * Main Tester for the Roach Motel
 * @author Chloe Culver
 *
 */
public class MainTester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Double for checkout cost
		Double checkout;
		// Payment Methods
		 Payment P = new RoachPal("MasterRoach" , "myRoachemail@roach.com");
		 Payment M  = new MasterRoach("Mr. Roach", "MasterRoach", "784", "05/12");
		// Get Instance of Roach Motel with num rooms 
		RoachMotel Motel = RoachMotel.getInstance(10);
		//Creating Roach Colonies
		RoachColony RC1 = new RoachColony("first colony" ,100, 200);
		RoachColony RC2 = new RoachColony("second colony", 50, 100);
		RoachColony RC3 = new RoachColony("third colony", 200, 100);
		RoachColony RC4 = new RoachColony("fourth colony", 300, 50);
		RoachColony RC5 = new RoachColony("fifth colony" ,100, 200);
		RoachColony RC6 = new RoachColony("sixth colony", 50, 100);
		RoachColony RC7 = new RoachColony("seventh colony", 200, 100);
		RoachColony RC8 = new RoachColony("eigth colony", 300, 50);
		RoachColony RC9 = new RoachColony("ninth colony" ,100, 200);
		RoachColony RC10 = new RoachColony("tenth colony", 50, 100);
		RoachColony RC11 = new RoachColony("eleventh colony",75, 400);
		//Creating Amenities 
		ArrayList<String> A = new ArrayList<String>();
		String[] strs = { "FoodBar","Spa","RefillBar","Shower" };
		String[] str2 = { "FoodBar","RefillBar","Shower" };
		String[] str3 = { "FoodBar","Spa","RefillBar"};
		for(String s : strs)
			A.add(s);
		ArrayList<String> A2 = new ArrayList<String>();
		ArrayList<String> A3 = new ArrayList<String>();
		ArrayList<String> A4 = new ArrayList<String>();
		ArrayList<String> A5 = new ArrayList<String>();
		ArrayList<String> A6 = new ArrayList<String>();
		ArrayList<String> A7 = new ArrayList<String>();
		ArrayList<String> A8 = new ArrayList<String>();
		ArrayList<String> A9 = new ArrayList<String>();
		ArrayList<String> A10 = new ArrayList<String>();
		ArrayList<String> A11 = new ArrayList<String>();
		for(String s : str2)
			A3.add(s);
		for(String s : str3)
			A2.add(s);
		for(String s : str2)
			A4.add(s);
		for(String s : str3)
			A5.add(s);
		for(String s : str2)
			A6.add(s);
		for(String s : str3)
			A7.add(s);
		for(String s : str2)
			A8.add(s);
		for(String s : str3)
			A9.add(s);
		for(String s : str2)
			A10.add(s);
		for(String s : str3)
			A11.add(s);

		//Checking in Colonies to rooms
		MotelRoom R1 = Motel.checkIn(RC1, "Deluxe", A);
		MotelRoom R2 = Motel.checkIn(RC2, "Regular", A2);
		MotelRoom R3 = Motel.checkIn(RC3, "Suite", A3);
		MotelRoom R4 = Motel.checkIn(RC4, "Regular", A4);
		MotelRoom R5 = Motel.checkIn(RC5, "Suite", A5);
		MotelRoom R6 = Motel.checkIn(RC6, "Deluxe", A6);
		MotelRoom R7 = Motel.checkIn(RC7, "Deluxe", A7);
		MotelRoom R8 = Motel.checkIn(RC8, "Regular", A8);
		MotelRoom R9 = Motel.checkIn(RC9, "Suite", A9);
		MotelRoom R10 = Motel.checkIn(RC10, "Regular", A10);
		//WaitList Test
		MotelRoom R11 = Motel.checkIn(RC11, "Deluxe", A11);
		System.out.println(Motel.toString());
		//Colony Check out with MasterRoach
		checkout = Motel.checkOut(R1, 3, M);
		System.out.println("cost: " + checkout);
		// Check in after waitList
		R11 = Motel.checkIn(RC11, "Deluxe", A2);
		System.out.println(Motel.toString());
		System.out.println("Spraying Rooms");
		RC1.party();
		System.out.println(RC1.toString());
		// Party Mode without Shower
		RC2.party();
		System.out.println(RC1.toString());
		R11.passDay();
		
		//Set doNotDisturb
		R11.setDisturbable(true);
		R2.setDisturbable(false);
		R3.setDisturbable(false);
		R4.setDisturbable(true);
		R5.setDisturbable(true);
		R6.setDisturbable(false);
		R7.setDisturbable(true);
		R8.setDisturbable(false);
		R9.setDisturbable(false);
		R10.setDisturbable(false);
		// Cleaning Services
		System.out.println("\n.......Cleaning Services.......");
		Motel.cleanRooms();
		
		checkout = Motel.checkOut(R4, 5, P);
		System.out.println("cost: " + checkout);
		
		R11.passDay();
		
	}

}
