import java.util.ArrayList;

public class Deluxe extends MotelRoom {
	public int price  = 75;
Deluxe()
{
	System.out.println("Deluxe Room Created");
}

public Deluxe(ArrayList amenities) {
	// TODO Auto-generated constructor stub

	System.out.println("Deluxe Room Created");
	
	//add amenities to price
	for(Object o : amenities)
	{
		//price += o.getPrice();
	}
}
public void update() {
	System.out.println("Regular room updated.");
}

}
