/**
 * Creates foodBar objects from Amenity abstract class
 * @author???
 *Input: takes BaseRoom as an assigned room
 *Output: none
 */
public class FoodBar extends Amenity {
	public FoodBar(MotelRoom baseRoom) {
		this.price = 10;
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
