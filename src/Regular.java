public class Regular extends BaseRoom {
	public Regular() {
		this.price = 50;
		this.resident = new RoachColony();
		this.doNotDisturb = false;
		this.vacancy = true;
		System.out.println("Vacant Regular Room created.");
	}
	
	public Regular(RoachColony resi) {
		this.price = 50;
		this.resident = resi;
		this.doNotDisturb = false;
		this.vacancy = false;
		System.out.println("Regular Room created.");
	}

	@Override
	public void visit() {
		if(isDisturbable()) System.out.println("Regular room:\nLinens have been changed.\nTowels on the floor have been replaced.");
		else System.out.println("Regular room:\n\"Do Not Disturb\" sign has been set. Will not clean.");
	}
	
	public static void main(String[] args) { //main method
		Regular room = new Regular();
	}
}
