import java.util.ArrayList;

public class Deluxe extends BaseRoom {
	public Deluxe(){
		this.price = 75;
		System.out.println("Deluxe Room Created");
	}

	@Override
	public void visit() {
		if(isDisturbable()) System.out.println("Regular room:\nLinens have been changed.\nAll towels have been replaced.");
		else System.out.println("Deluxe room:\n\"Do Not Disturb\" sign has been set. Will not clean.");
	}

}
