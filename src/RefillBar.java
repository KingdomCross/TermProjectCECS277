public class RefillBar extends Amenity {
	public RefillBar(MotelRoom baseRoom) {
		this.price = 5;
		this.base = baseRoom;
	}

	@Override
	public boolean hasShower() {
		// TODO Auto-generated method stub
		return false;
	}
}
