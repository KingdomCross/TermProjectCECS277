public class Shower extends Amenity {
	public Shower(MotelRoom baseRoom) {
		this.price = 25;
		this.base = baseRoom;
		this.hasShower = true;
	}
	
	public void passDay() {
		base.passDay(true);
	}
	
	public void passDay(boolean hasShower) {
		base.passDay(true);
	}

	@Override
	public boolean hasShower() {
		// TODO Auto-generated method stub
		return true;
	}


}
