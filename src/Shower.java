/**
 * This Class  creates the Shower Amenity
 * @author ???
 *	Input: Takes in the MotelRoom and assigns itself to the room
 *	Output: None
 */
public class Shower extends Amenity {
	/**
	 * Constructor for the Shower
	 * @param baseRoom MotelRoom that is assigned itself
	 */
	public Shower(MotelRoom baseRoom) {
		this.price = 25;
		this.base = baseRoom;
	}
	/**
	 * Passes day for colony visit
	 */
	public void passDay() {
		base.passDay(true);
	}
	/**
	 * Passes day for colony visit
	 */
	public void passDay(boolean hasShower) {
		base.passDay(true);
	}

	/**
	 * Hardcoded value true because it is Shower
	 */
	@Override
	public boolean hasShower() {
		// TODO Auto-generated method stub
		return true;
	}


}
