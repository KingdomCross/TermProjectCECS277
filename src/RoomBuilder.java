import java.util.ArrayList;

/**
 * Factory class that produces and returns MotelRoom subclasses.
 * @author Alexander Dung
 *
 */
public class RoomBuilder {
	/**
	 * Builds and returns a room based on argument variables.
	 * 
	 * @param rc
	 * @param room
	 * @param amenities
	 * @return
	 */
	public MotelRoom buildRoom(RoachColony rc, String room, ArrayList<String> amenities ){  
		MotelRoom newRoom = new Regular();
		if(room.equalsIgnoreCase("Regular")) {
			newRoom = amenities == null ? new Regular() : placeAmenities(amenities, new Regular());
		}
		else if(room.equalsIgnoreCase("Deluxe")) {
			newRoom = amenities == null ? new Deluxe() : placeAmenities(amenities, new Deluxe());
		}
		else if(room.equalsIgnoreCase("Suite")) {
			newRoom = amenities == null ? new Suite() : placeAmenities(amenities, new Suite());
		}
		return newRoom;  
	}
	
	private MotelRoom placeAmenities(ArrayList<String> amenities, MotelRoom base) {
		if(amenities.size() == 0) return base;
		else {
			MotelRoom newRoom;
			ArrayList<String> tempList = amenities;
			switch(tempList.remove(0).toLowerCase()) {
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
			return placeAmenities(tempList, newRoom);
		}
	}
}
