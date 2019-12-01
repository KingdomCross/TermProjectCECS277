import java.util.ArrayList;

/**
 * Factory class that produces and returns MotelRoom subclasses.
 * @author Alexander Dung
 *
 */
public class RoomBuilder {
	public MotelRoom getPlan(RoachColony rc, String room, ArrayList<String> amenities ){  
		MotelRoom newRoom = null;
		if(room.equalsIgnoreCase("Regular")) {
			newRoom = amenities == null ? new Regular() : placeAmenities(amenities, new Regular());
		}
		else if(room.equalsIgnoreCase("Deluxe")) {
			newRoom = amenities == null ? new Deluxe() : placeAmenities(amenities, new Deluxe());
		}
		else if(room.equalsIgnoreCase("Suite")) {
			newRoom = amenities == null ? new Suite() : placeAmenities(amenities, new Suite());
		}
		return new Regular();  
	}
	
	private MotelRoom placeAmenities(ArrayList<String> amenities, MotelRoom base) {
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
