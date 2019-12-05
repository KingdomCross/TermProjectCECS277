/**
 * Abstract superclass for amenities, which serve as decorators to a base MotelRoom.
 * Must be abstract rather than 
 * @author Alexander Dung
 *Input:none
 *Output:none
 */
public abstract class Amenity implements MotelRoom{
	protected MotelRoom base;
	protected int price;
	/**
	 * 
	 */
	public boolean isDisturbable() {
		return this.base.isDisturbable();
	}
	/**
	 * set Do Not Disturb value
	 */
	public void setDisturbable(boolean dist) {
		this.base.setDisturbable(dist);
	}
	/**
	 * returns price
	 */
	public int getPrice() {
		return this.price + base.getPrice();
	}
	/**
	 * returns resident of room instance
	 */
	public RoachColony getResident() {
		return this.base.getResident();
	}
	/**
	 * returns room number of resident
	 */
	public int getRoomNumber() {
		return this.base.getRoomNumber();
	}
	/**
	 *  returs Vacany boolean of this room instance assigned to
	 */
	public boolean isVacant() {
		return this.base.isVacant();
	}
	/**
	 * Simulates 1 day passing
	 */
	public void passDay() {
		this.base.passDay();
	}
	/**
	 * allows visitors to visit MotelRoom
	 */
	public void accept(MotelRoomVisitor visitor) {
		base.accept(visitor);
		visitor.visit(this);
	}
	/**
	 * textual represents the Amenity instance
	 */
	@Override
	public String toString() {
		return base.toString() + "\n    " + this.getClass().getSimpleName();
	}
}
