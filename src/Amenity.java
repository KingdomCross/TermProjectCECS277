/**
 * Abstract superclass for amenities, which serve as decorators to a base MotelRoom.
 * Must be abstract rather than 
 * @author Alexander Dung
 *
 */
public abstract class Amenity implements MotelRoom{
	protected MotelRoom base;
	protected int price;
	protected boolean hasShower;
	
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
	
	public int getRoomNumber() {
		return this.base.getRoomNumber();
	}

	public boolean isVacant() {
		return this.base.isVacant();
	}
	
	public void passDay() {
		this.base.passDay(false);
	}
	
	public void passDay(boolean hasShower) {
		this.base.passDay(hasShower);
	}
	
	public void accept(MotelRoomVisitor visitor) {
		base.accept(visitor);
		visitor.visit(this);
	}
	public void hasShower(boolean b)
	{
		this.hasShower = b;
	}
	
	@Override
	public String toString() {
		return base.toString() + "\n    " + this.getClass().getSimpleName();
	}
}
