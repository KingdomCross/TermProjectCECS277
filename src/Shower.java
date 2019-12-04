public class Shower extends Amenity {
	public Shower(MotelRoom baseRoom) {
		this.price = 25;
		this.base = baseRoom;
	}
	
	public void passDay() {
		base.passDay(true);
	}
	
	public void passDay(boolean hasShower) {
		base.passDay(true);
	}


	public boolean hasShower() {
		// TODO Auto-generated method stub
		return true;
	}
}
