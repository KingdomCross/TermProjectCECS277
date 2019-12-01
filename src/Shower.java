public class Shower extends Amenity {
	public Shower(MotelRoom baseRoom) {
		this.price = 25;
		this.base = baseRoom;
	}
	
	@Override
	public void visit() {
		if(isDisturbable()) {
			base.visit();
			System.out.println("Spray Resistant Shower has been cleaned.");
		}
		else System.out.println("Motel room has sign set to \"Do Not Disturb\".");
	}
	
	@Override
	public void passDay() {
		base.passDay(true);
	}
	
	@Override
	public void passDay(boolean hasShower) {
		base.passDay(true);
	}
}
