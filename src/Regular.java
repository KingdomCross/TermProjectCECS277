import java.util.ArrayList;

public class Regular extends MotelRoom {
	public int price = 50;
	Regular()
	{
		System.out.println("Regular Room Created");
	}

	public Regular(ArrayList amenities) {
		// TODO Auto-generated constructor stub
		System.out.println("Regular Room Created");
		

		//add amenities to price
		for(Object o : amenities)
		{
			//price += o.getPrice();
		}
	}
	
	

}
