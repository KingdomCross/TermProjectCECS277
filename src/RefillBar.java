/**
 * This Class  creates the RefillBar Amenity
 * @author ???
 *	Input: Takes in the MotelRoom and decorates the room
 *	Output: None
 */
public class RefillBar extends Amenity {
	/**
	 * Constructor
	 * @param baseRoom room instacne amenity is assigned to
	 */
	public RefillBar(MotelRoom baseRoom) {
		this.price = 5;
		this.base = baseRoom;
	}

	@Override
	/**
	 * returns false becasue it's not a Shower object
	 */
	public boolean hasShower() {
		// TODO Auto-generated method stub
		return false;
	}
}
