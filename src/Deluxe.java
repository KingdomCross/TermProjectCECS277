import java.util.ArrayList;

public class Deluxe extends MotelRoom { //extend to MotelRoom
	public Deluxe(){ //constructor
		this.price = 75; //label const price
		System.out.println("Deluxe Room Created"); //Notify system output
	}
	
	public void update() {
		System.out.println("Regular room updated.");
	} //string update

}
