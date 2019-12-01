/**
 * Abstract superclass for amenities, which serve as decorators to a base MotelRoom.
 * Must be abstract rather than 
 * @author Alexander Dung
 *
 */
public abstract class Amenity implements MotelRoom{
	protected MotelRoom base;
	protected int price;
	public abstract void visit();
	public boolean isDisturbable() {
		return this.base.isDisturbable();
	}
	public void setDisturbable(boolean dist) {
		this.base.setDisturbable(dist);
	}
	public int getPrice() {
		return this.price + base.getPrice();
	}
	public RoachColony getResident() {
		return this.base.getResident();
	}
	public boolean isVacant() {
		return this.base.isVacant();
	}
}
