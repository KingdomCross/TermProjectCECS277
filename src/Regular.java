import java.util.ArrayList;

public class Regular extends MotelRoom {
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
}
