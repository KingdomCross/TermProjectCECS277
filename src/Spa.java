public class Spa extends Amenity {
	public Spa(MotelRoom baseRoom) {
		this.price = 20;
		this.base = baseRoom;
	}

	@Override
	public boolean hasShower() {
		// TODO Auto-generated method stub
		return false;
	}
}
