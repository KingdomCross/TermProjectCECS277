/**
 * This Class  creates the Deluxe Rooms
 * @author ???
 *	Input: Takes in the RoachColony and it's population and assigns itself to the room
 *	Output: Creates Regular Room object at the request of the RoomBuilder class
 */
public class Suite extends BaseRoom {
	private boolean shower;
	public Suite(){
		this.price = 75;
		this.roomNumber = -1;
		this.resident = new RoachColony();
		this.disturbable = false;
		this.vacancy = true;
	}
	
	public Suite(RoachColony resi, int num) {
		this.price = 50;
		this.roomNumber = num;
		this.resident = resi;
		this.disturbable = true;
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
