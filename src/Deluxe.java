import java.util.ArrayList;

public class Deluxe extends BaseRoom {
	public boolean shower;
	public Deluxe(){
		this.price = 75;
		this.roomNumber = -1;
		this.resident = new RoachColony();
		this.doNotDisturb = false;
		this.vacancy = true;
		System.out.println("Vacant Deluxe Room Created");
	}
	
	public Deluxe(RoachColony resi, int num) {
		this.price = 50;
		this.roomNumber = num;
		this.resident = resi;
		this.doNotDisturb = false;
		this.vacancy = false;
		System.out.println("Deluxe Room Created");
	}
}
