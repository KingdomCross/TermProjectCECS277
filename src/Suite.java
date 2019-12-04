import java.util.ArrayList;

public class Suite extends BaseRoom {
	public Suite(){
		this.price = 75;
		this.roomNumber = -1;
		this.resident = new RoachColony();
		this.doNotDisturb = false;
		this.vacancy = true;
		System.out.println("Vacant Suite Created");
	}
	
	public Suite(RoachColony resi, int num, ArrayList<String> amenities) {
		this.price = 50;
		this.roomNumber = num;
		this.resident = resi;
		this.doNotDisturb = false;
		this.vacancy = false;
		this.A = amenities;
		System.out.println("Suite Created");
	}
}
