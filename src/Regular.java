

public class Regular extends BaseRoom {
	
	private boolean shower;
	public Regular() {
		this.price = 50;
		this.roomNumber = -1;
		this.resident = new RoachColony();
		this.doNotDisturb = false;
		this.vacancy = true;
	}
	
	public Regular(RoachColony resi, int num) {
		this.price = 50;
		this.roomNumber = num;
		this.resident = resi;
		this.doNotDisturb = false;
		this.vacancy = false;

	}

	@Override
	public void hasShower(boolean b) {
		// TODO Auto-generated method stub
		shower = b;
	}
	
	public boolean hasShower()
	{
		return shower;
	}
}
