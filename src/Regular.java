/**
 * Regular room Constructor by Extending base class BaseRoom
 * @author???
 *Input: Takes in RoachColony and it's population
 *Output: Creates Regular Room object at the request of the RoomBuilder class
 */

public class Regular extends BaseRoom {
	//Boolean for Shower Amenity
	private boolean shower;
	/*
	 * Default Constructor
	 */
	public Regular() {
		this.price = 50;
		this.roomNumber = -1;
		this.resident = new RoachColony();
		this.doNotDisturb = false;
		this.vacancy = true;
	}
	/**
	 * Constructor for Regular Room
	 * @param resi RoachColony Resident
	 * @param num population of RoachColony
	 */
	public Regular(RoachColony resi, int num) {
		this.price = 50;
		this.roomNumber = num;
		this.resident = resi;
		this.doNotDisturb = false;
		this.vacancy = false;

	}
	/**
	 * returns true if Shower Amenity was purchased
	 */
	public boolean hasShower()
	{
		return shower;
	}
}
