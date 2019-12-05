

public class Suite extends BaseRoom {
	private boolean shower;
	public Suite(){
		this.price = 75;
		this.roomNumber = -1;
		this.resident = new RoachColony();
		this.doNotDisturb = false;
		this.vacancy = true;
		//System.out.println("Vacant Suite Created");
	}
	
	public Suite(RoachColony resi, int num) {
		this.price = 50;
		this.roomNumber = num;
		this.resident = resi;
		this.doNotDisturb = false;
		this.vacancy = false;
		//System.out.println("Suite Created");
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
