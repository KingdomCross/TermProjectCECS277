
public class Spa extends Amenity {
	public Spa(MotelRoom baseRoom) {
		this.price = 20;
		this.base = baseRoom;
	}
	
	@Override
	public void visit() {
		if(isDisturbable()) {
			base.visit();
			System.out.println("Spa has been cleaned.");
		}
		else System.out.println("Motel room has sign set to \"Do Not Disturb\".");
	}

}
