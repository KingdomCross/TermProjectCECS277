import java.util.ArrayList;

public class Regular extends BaseRoom {
	public Regular() {
		this.price = 50;
		System.out.println("Regular Room Created");
	}
	
	public void update() {
		System.out.println("Regular room updated.");
	}
	
	public static void main(String[] args) {
		Regular room = new Regular();
		room.update();
	}
	
	
	
	public String toString() {
		return "";
	}

	@Override
	public void visit() {
		if(isDisturbable()) System.out.println("Regular room:\nLinens have been changed.\nTowels on the floor have been replaced.");
		else System.out.println("Regular room:\n\"Do Not Disturb\" sign has been set. Will not clean.");
	}
}
