import java.util.ArrayList;

public class Suite extends MotelRoom {
	public int price = 100;
	Suite()
	{
		System.out.println("Suite Room Created");
	}
	public Suite(ArrayList amenities) {
		// TODO Auto-generated constructor stub
		System.out.println("Suite Room Created");
		//add amenities to price
		for(Object o : amenities)
		{
			//price += o.getPrice();
		}
	}
	
	public void getPrice()
	{
		
	}
	public void update() {
		System.out.println("Regular room updated.");
	}
	
}
