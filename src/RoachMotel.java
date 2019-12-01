import java.util.ArrayList;

/**
 * Represents a Roach Motel with a certain number of rooms and maids.
 * Has methods to 
 * @author Alexander Dung
 *
 */
public class RoachMotel {
	private static RoachMotel singleMotel;
	private RoomBuilder builder;
	private MotelRoom[] rooms;
	//private Maid[] maids;
	
	private RoachMotel() {
		rooms = new MotelRoom[10];
		//maids = new Maid[10];
	}
	
	private RoachMotel(int numRooms) {
		rooms = new MotelRoom[numRooms];
		//maids = new Maid[numMaids];
	}
	
    /**
     * Returns the Singleton instance of the RoachMotel.
     * If the instance is not yet instantiated, constructs a new RoachMotel using its default constructor.
     * Otherwise, returns the instance.
     * @return the single instance of the RoachMotel
     */
    public static RoachMotel getInstance() {
    	if(singleMotel == null) {
    		singleMotel = new RoachMotel();
    	}
    	return singleMotel;
    }
    
    /**
     * Returns the Singleton instance of the RoachMotel.
     * If the instance is not yet instantiated, constructs a new RoachMotel with this method's argument.
     * Otherwise, returns the instance.
     * @param numRooms number of rooms to instantiate the RoachMotel with if the instance has not yet been created
     * @return the single instance of the RoachMotel
     */
    public static RoachMotel getInstance(int numRooms) {
    	if(singleMotel == null) {
    		singleMotel = new RoachMotel(numRooms);
    	}
    	return singleMotel;
    }
    
    /**
     * Instantiates each MotelRoom so that they can be accessed.
     */
    public void createRooms() {
    	for(int index = 0; index < rooms.length; index++) {
    		rooms[index] = new Regular();
    	}
    }

    public MotelRoom checkIn(RoachColony colony, String suite, ArrayList<String> amenities) {
        
    	return 
    }

    public Double checkOut(MotelRoom r2, int i, String masterRoach) {
        return null;
    }

    public void cleanRooms() {
    	
    }
}
