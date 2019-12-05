/**
 * This Class  creates the Deluxe Rooms
 * @author ???
 *	Input: Takes in the RoachColony and it's population and assigns itself to the room
 *	Output: Creates Regular Room object at the request of the RoomBuilder class
 */

public class Deluxe extends BaseRoom {
	//boolean for shower Amenity
	private boolean shower;
	/**
	 * Defualt Constructor for Deluxe Room
	 */
	public Deluxe(){
		this.price = 75;
		this.roomNumber = -1;
		this.resident = new RoachColony();
		this.disturbable = false;
		this.vacancy = true;
	}
	/**
	 * Constructor for Deluxe Room
	 * @param resi RoachColony Resident
	 * @param num population of RoachColony
	 */
	public Deluxe(RoachColony resi, int num) {
		this.price = 50;
		this.roomNumber = num;
		this.resident = resi;
		this.disturbable = true;
		this.vacancy = false;
	}
	/**
	 * returns Shower boolean
	 */
	public boolean hasShower()
	{
		return shower;
	}
}
