import java.util.ArrayList;

/**
 * Main Tester for the Roach Motel
 * @author Chloe Culver
 *
 */
public class MainTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Get Instance of Roach Motel with num rooms 
		RoachMotel Motel = RoachMotel.getInstance(10);
		Motel.toString();
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
		// Creating Ameneties 
		ArrayList A = new ArrayList();
		A.add("Foodbar");
		A.add("Spa");
		A.add("RefillBar");
		A.add("Shower");
		ArrayList A2 = new ArrayList();
		A2.add("Spa");
		A2.add("FoodBar");
		
		//Checking in Colonies to rooms
		MotelRoom R1 = Motel.checkIn(RC1, "Deluxe", A);
		MotelRoom R2 = Motel.checkIn(RC2, "Regular", A2);
		MotelRoom R3 = Motel.checkIn(RC1, "Suite", A);
		MotelRoom R4 = Motel.checkIn(RC2, "Regular", A2);
		MotelRoom R5 = Motel.checkIn(RC1, "Suite", A);
		MotelRoom R6 = Motel.checkIn(RC2, "Deluxe", A2);
		MotelRoom R7 = Motel.checkIn(RC1, "Deluxe", A);
		MotelRoom R8 = Motel.checkIn(RC2, "Regular", A2);
		MotelRoom R9 = Motel.checkIn(RC1, "Suite", A);
		MotelRoom R10 = Motel.checkIn(RC2, "Regular", A2);
		Motel.toString();
		
	}

}
