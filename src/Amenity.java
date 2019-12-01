/**
 * Abstract superclass for amenities, which serve as decorators to a base MotelRoom.
 * Must be abstract rather than 
 * @author Alexander Dung
 *
 */
public abstract class Amenity extends MotelRoom {
	private MotelRoom base;
	private String amenityName;
	public void setDoNotDisturb(boolean dn) {
		base.setDoNotDisturb(dn);
	}
	public boolean getDoNotDisturb() {
		return base.getDoNotDisturb();
	}
}
