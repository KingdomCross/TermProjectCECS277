import java.util.ArrayList;

/**
 * Represents a Roach Motel with a certain number of rooms and maids.
 * Has methods to 
 * @author Alexander Dung
 *
 */
public class RoachMotel {
	private static RoachMotel singleMotel;
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
	
    public static RoachMotel getInstance() {
    	if(singleMotel == null) {
    		singleMotel = new RoachMotel();
    	}
    	return singleMotel;
    }
    
    public static RoachMotel getInstance(int numRooms) {
    	if(singleMotel == null) {
    		singleMotel = new RoachMotel(numRooms);
    	}
    	return singleMotel;
    }

    public MotelRoom checkIn(RoachColony colony, String suite, ArrayList amenities) {
        
    }

    public Double checkOut(MotelRoom r2, int i, String masterRoach) {
        return null;
    }

    public void cleanRooms() {
    	
    }
}
