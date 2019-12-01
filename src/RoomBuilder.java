import java.util.ArrayList;

/**
 * Factory class that produces and returns MotelRoom subclasses.
 * @author Alexander Dung
 *
 */
public class RoomBuilder {
	public MotelRoom getPlan(RoachColony rc, String room, ArrayList amenities ){  
		if(room == null) return null;  
		else if(room.equalsIgnoreCase("Regular")) return new Regular(amenities);
		else if(room.equalsIgnoreCase("Deluxe")) return new Deluxe(amenities);
		else if(room.equalsIgnoreCase("Suite")) return new Suite(amenities); 
		else return null;  
	}
}
