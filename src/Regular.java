import java.util.ArrayList;

public class Regular extends MotelRoom {
	//maybe use the default-constructed Regular as a vacant room?
	public Regular() { //Constructor
		this.price = 50; //Const number
		System.out.println("Regular Room Created"); //Notify system
	}
	
	public void update() {
		System.out.println("Regular room updated.");
	} //update method
	
	public static void main(String[] args) { //main method
		Regular room = new Regular();
		room.update();
	}
	
	
	
	public String toString() {
		return "";
	} //toString method when called
}
