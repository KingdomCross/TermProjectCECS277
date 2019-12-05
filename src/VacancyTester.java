import java.util.ArrayList;

public class VacancyTester {
	public static void main(String args[]) {
		RoachMotel rm = RoachMotel.getInstance(2);
		RoachColony ree = new RoachColony();
		MotelRoom temp = rm.checkIn(ree, "Deluxe", new ArrayList() );
		MotelRoom temp2 = rm.checkIn(ree, "suite", new ArrayList());
		rm.checkIn(new RoachColony(), "Deluxe", new ArrayList() );
		rm.checkIn(new RoachColony(), "Deluxe", new ArrayList() );

		rm.checkOut(temp, 10, (Payment)new RoachPal("test","email"));
		rm.checkIn(new RoachColony(), "Deluxe", new ArrayList() );
		rm.checkOut(temp2, 10, (Payment)new RoachPal("test","email"));
	}
}
