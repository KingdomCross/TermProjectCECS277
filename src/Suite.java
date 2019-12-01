public class Suite extends BaseRoom {
	public Suite(){
		this.price = 75;
		this.roomNumber = -1;
		this.resident = new RoachColony();
		this.doNotDisturb = false;
		this.vacancy = true;
		System.out.println("Vacant Suite Created");
	}
	
	public Suite(RoachColony resi, int num) {
		this.price = 50;
		this.roomNumber = num;
		this.resident = resi;
		this.doNotDisturb = false;
		this.vacancy = true;
		System.out.println("Suite Created");
	}

	@Override
	public void visit() {
		if(isDisturbable()) System.out.println("Regular room:\nLinens have been changed.\nAll towels have been replaced.\nA hamburger has been placed on the pillow.");
		else System.out.println("Suite room:\n\"Do Not Disturb\" sign has been set. Will not clean.");
	}
}
