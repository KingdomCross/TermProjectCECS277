import java.util.ArrayList;

public class Suite extends BaseRoom {
	public Suite(){
		this.price = 100;
		System.out.println("Suite Room Created");
	}
	@Override
	public void visit() {
		if(isDisturbable()) System.out.println("Regular room:\nLinens have been changed.\nAll towels have been replaced.\nA hamburger has been placed on the pillow.");
		else System.out.println("Suite room:\n\"Do Not Disturb\" sign has been set. Will not clean.");
	}
	
}
