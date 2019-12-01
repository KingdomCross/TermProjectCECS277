
public class Spa extends Amenity {
	public Spa(MotelRoom baseRoom) {
		this.price = 20; //Const declare number
		this.base = baseRoom; //reference to Amenity
		this.amenityName = "Spa"; //Reference to string
	}
	@Override
	public void update() { //update method
		// TODO Auto-generated method stub

	}

}
