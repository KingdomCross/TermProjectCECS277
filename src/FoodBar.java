public class FoodBar extends Amenity {
	public FoodBar(MotelRoom baseRoom) {
		this.price = 10;
		this.base = baseRoom;
	}

	@Override
	public boolean hasShower() {
		// TODO Auto-generated method stub
		return false;
	}

}
