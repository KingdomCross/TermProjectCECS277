public class FoodBar extends Amenity {
	public FoodBar(MotelRoom baseRoom) {
		this.price = 10;
		this.base = baseRoom;
	}
	
	@Override
	public void visit() {
		if(isDisturbable()) {
			base.visit();
			System.out.println("Food Bar has been opened.");
		}
		else System.out.println("Motel room has sign set to \"Do Not Disturb\".");
	}

}
