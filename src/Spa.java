
public class Spa extends Amenity {
	public Spa(MotelRoom baseRoom) {
		this.price = 20;
		this.base = baseRoom;
		this.amenityName = "Spa";
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}