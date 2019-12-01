
public class RefillBar extends Amenity {
	public RefillBar(MotelRoom baseRoom) {
		this.price = 5; //const price
		this.base = baseRoom; //reference to Amenity
		this.amenityName = "Food Bar Refill"; //variable string reference to Amenity
	}
	@Override
	public void update() { //method
		// TODO Auto-generated method stub

	}

}
