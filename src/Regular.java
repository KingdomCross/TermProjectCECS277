import java.util.ArrayList;

public class Regular extends MotelRoom {
	public int price = 50;
	
	public Regular() {
		System.out.println("Regular Room Created");
	}
	
	public void update() {
		System.out.println("Regular room updated.");
	}
	
	public static void main(String[] args) {
		Regular room = new Regular();
		room.update();
	}
}
