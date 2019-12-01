/**
 * Abstract superclass for amenities, which serve as decorators to a base MotelRoom.
 * Must be abstract rather than 
 * @author Alexander Dung
 *
 */
public abstract class Amenity extends MotelRoom { //Abstract class
	protected MotelRoom base; //Object variable
	protected String amenityName; //string for the name of item
	public void setDoNotDisturb(boolean dn) {
		base.setDoNotDisturb(dn);
	} //reference to base script
	public boolean getDoNotDisturb() {
		return base.getDoNotDisturb();
	} //reference for grabbing
}
