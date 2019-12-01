import java.util.ArrayList;

/**
 * Factory class that produces and returns MotelRoom subclasses.
 * @author Alexander Dung
 *
 */
public class RoomBuilder {
	public MotelRoom getPlan(RoachColony rc, String room, ArrayList<String> amenities ){  
		if(room == null) return null;  
		else if(room.equalsIgnoreCase("Regular")) {
			if (amenities == null) return new Regular();
		}
		else if(room.equalsIgnoreCase("Deluxe")) {
			if(amenities == null) return new Deluxe();
		}
		else if(room.equalsIgnoreCase("Suite")) {
			if(amenities == null) return new Suite(); 
		}
		return new Regular();  
	}
	
	public MotelRoom placeAmenities(ArrayList<String> amenities, MotelRoom base) {
		if(amenities.size() == 0) return base;
		else {
			MotelRoom newRoom;
			switch(amenities.remove(0).toLowerCase()) {
			case "foodbar":
				newRoom = new FoodBar(base);
				break;
			case "refillbar":
				newRoom = new RefillBar(base);
				break;
			case "shower":
				newRoom = new Shower(base);
				break;
			case "spa":
				newRoom = new Spa(base);
				break;
			default: newRoom = base;
			}
			return newRoom;
		}
	}
}
