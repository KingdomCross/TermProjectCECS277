
public class FoodBar extends Amenity {
	public FoodBar(MotelRoom baseRoom) { //constructor
		this.price = 10; //const price
		this.base = baseRoom; //object reference to Amenity
		this.amenityName = "Food Bar"; //Label variable
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
