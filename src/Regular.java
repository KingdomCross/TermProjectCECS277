import java.util.ArrayList;

public class Regular extends BaseRoom {
	

	public Regular() {
		this.price = 50;
		this.roomNumber = -1;
		this.resident = new RoachColony();
		this.doNotDisturb = false;
		this.vacancy = true;
		//System.out.println("Vacant Regular Room created.");
	}
	
	public Regular(RoachColony resi, int num, ArrayList<String> amenities) {
		this.price = 50;
		this.roomNumber = num;
		this.resident = resi;
		this.doNotDisturb = false;
		this.vacancy = false;
		this.A = amenities;
		System.out.println("Regular Room created.");
	}
}
