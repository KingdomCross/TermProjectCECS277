import java.util.ArrayList;

/**
 * Factory class that produces and returns MotelRoom subclasses.
 * Input: Takes in the RoachColony, the roomType, and it's amenities
 * Output: Creates Rooms of multiple types
 * @author Alexander Dung
 *
 */
public class RoomBuilder {
	/**
	 * Builds and returns a room based on argument variables.
	 * 
	 * @param colony the RoachColony checking into the MotelRoom being built
	 * @param room the room number of the MotelRoom being built
	 * @param amenities the list of amenities wanted with the MotelRoom being built
	 * @param roomNumber the room number that the MotelRoom being built will have
	 * @return a fully decorated Regular, Deluxe, or Suite based on the argument String, or a vacant Regular if the String cannot be interpreted as one of the three
	 */
	public MotelRoom buildRoom(RoachColony colony, String room, ArrayList<String> amenities, int roomNumber){
		if(room.equalsIgnoreCase("regular")) return placeAmenities(amenities, new Regular(colony, roomNumber));
		else if(room.equalsIgnoreCase("deluxe")) return placeAmenities(amenities, new Deluxe(colony, roomNumber));
		else if(room.equalsIgnoreCase("suite")) return placeAmenities(amenities, new Suite(colony, roomNumber));
		return buildVacantRoom();  
	}
	
	/**
	 * Returns a vacant Regular with an empty RoachColony.
	 * @return a vacant Regular
	 */
	public MotelRoom buildVacantRoom() {
		return new Regular();
	}
	
	/**
	 * Recursively decorates the argument MotelRoom with Amenities based on the argument ArrayList of Strings.
	 * @param amenities the list of Amenities to decorate the argument MotelRoom with
	 * @param base the base MotelRoom to decorate with Amenities
	 * @return the argument MotelRoom decorated with Amenities based on the argument ArrayList
	 */
	private MotelRoom placeAmenities(ArrayList<String> amenities, MotelRoom base) {
		
		//base case - all amenities have been applied
		if(amenities.size() == 0) return base;
		//recursive case - still have amenities to apply
		else {
			//create dummy MotelRoom to return later
			MotelRoom newRoom;
			//create copy of argument ArrayList to modify
			ArrayList<String> tempList = amenities;
			//get the first String off the copy, and check what Amenity the String indicates
			switch(tempList.remove(0).toLowerCase()) {
			//if the String is foodbar, wrap the argument MotelRoom with a FoodBar
			case "foodbar":
				
				newRoom = new FoodBar(base);
				break;
			//if the String is refillbar, wrap the argument MotelRoom with a RefillBar
			case "refillbar":
				newRoom = new RefillBar(base);
				break;
			//if the String is shower, wrap the argument MotelRoom with a Shower
			case "shower":
				newRoom = new Shower(base);
				
				break;
			//if the String is Spa, wrap the argument MotelRoom with a Spa
			case "spa":
				newRoom = new Spa(base);
				break;
			//if the String is none of the above, then do not wrap the argument MotelRoom
			default: newRoom = base;
			}
			//continue wrapping the argument BaseRoom with the rest of the listed amenities
			return placeAmenities(tempList, newRoom);
		}
	}
}
