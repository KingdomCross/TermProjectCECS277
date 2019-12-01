
public class Shower extends Amenity {
	public Shower(MotelRoom baseRoom) {
		this.price = 25; //Const price
		this.base = baseRoom; //Reference to Amenity
		this.amenityName = "Spray Resistant Shower"; //String declare
	}
	@Override
	public void update() { //Update method
		// TODO Auto-generated method stub

	}

}
