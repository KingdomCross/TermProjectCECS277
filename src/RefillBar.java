public class RefillBar extends Amenity {
	public RefillBar(MotelRoom baseRoom) {
		this.price = 5;
		this.base = baseRoom;
	}
	
	@Override
	public void visit() {
		if(isDisturbable()) {
			base.visit();
			System.out.println("Food Bar has been refilled.");
		}
		else System.out.println("Motel room has sign set to \"Do Not Disturb\".");
	}

}
