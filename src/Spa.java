/**
 * This Class Creaes the Spa Amenity
 * @author ???
 * Input: Takes in MotelRoom it is assigned to
 * Output: none
 */
public class Spa extends Amenity {
	/**
	 * Constructor for Spa Amenity
	 * @param baseRoom
	 */
	public Spa(MotelRoom baseRoom) {
		this.price = 20;
		this.base = baseRoom;
	}

	/**
	 * Hardcoded value false because it is not Shower
	 */
	@Override
	public boolean hasShower() {
		// TODO Auto-generated method stub
		return false;
	}
}
