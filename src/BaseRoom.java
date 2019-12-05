
/**
 * Superclass for motel rooms.
 * Contains a RoachMotel for observation purposes, and a member RoachColony, int, and boolean.
 * @author ???
 *Input: none
 *Output: none
 */
public abstract class BaseRoom implements MotelRoom{
	protected RoachColony resident;
	protected int price, roomNumber;
	protected boolean disturbable;
	protected boolean vacancy;
	protected int days = 0;
	
	/**
	 * returns whether the room can be disturbed - true means that the room can be entered
	 */
	public boolean isDisturbable() {
		return this.disturbable;
	}
	/**
	 * sets the Do Not Disturb sign for the room
	 */
	public void setDisturbable(boolean dist) {
		this.disturbable = dist;
	}
	/**
	 * returns price of the room
	 */
	public int getPrice() {
		return this.price;
	}
	/**
	 * returns the RoachColony occupying the room
	 */
	public RoachColony getResident() {
		return this.resident;
	}
	/**
	 * returns the Roomnumber of the room instance
	 */
	public int getRoomNumber() {
		return this.roomNumber;
	}
	/**
	 * returns Vacany boolean
	 */
	public boolean isVacant() {
		return this.vacancy;
	}
	/**
	 * simulates the Day pass and tells residence to Party
	 */
	public void passDay() {
		//resident.party();
		this.days ++;
	}


	/**
	 * Accepts visitor and assigns the visitor to a room
	 */
	public void accept(MotelRoomVisitor visitor) {
		visitor.visit(this);
	}
	/**
	 * returns String of the room information
	 */
	public String toString() {
		return String.format("%s room:\n  Room Number: %d\n  Resident: %s\n  Do Not Disturb: %s\n  Vacant: %s\n  Amenities:", this.getClass().getSimpleName(), this.getRoomNumber(), this.resident.toString(), String.valueOf(this.isDisturbable()), String.valueOf(this.isVacant()));
	}
}
