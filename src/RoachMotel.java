import java.util.ArrayList;

/**
 * Represents a Roach Motel with a certain number of rooms and maids.
 * Has methods to 
 * @author Alexander Dung
 *
 */
public class RoachMotel {
	private static RoachMotel singleMotel;
	private ArrayList<RoachColony> waitList;
	private RoomBuilder builder;
	private MotelRoom[] rooms;
	
	private RoachMotel() {
		waitList = new ArrayList<>();
		builder = new RoomBuilder();
		rooms = new BaseRoom[10];
	}
	
	private RoachMotel(int numRooms) {
		waitList = new ArrayList<>();
		builder = new RoomBuilder();
		rooms = new BaseRoom[numRooms];
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
    		singleMotel.createRooms();
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
    		singleMotel.createRooms();
    	}
    	return singleMotel;
    }
    
    /**
     * Instantiates each MotelRoom to a vacant room so that they can be accessed.
     */
    public void createRooms() {
    	for(int index = 0; index < rooms.length; index++) {
    		rooms[index] = new Regular();
    	}
    }

    public MotelRoom checkIn(RoachColony colony, String roomType, ArrayList<String> amenities) {
    	for(int index = 0; index < rooms.length; index++) {
    		if(rooms[index].isVacant()) {
    			MotelRoom newRoom = builder.buildRoom(colony, roomType, amenities);
    			rooms[index] = newRoom;
    			return newRoom;
    		}
    		else {
    			waitList.add(colony);
    			return null;
    		}
    	}
    	return builder.buildRoom(colony, roomType, amenities);
    }

    /**
     * Calculates the price of the argument room's visit and charges the appropriate account based on the argument String.
     * @param room
     * @param days
     * @param masterRoach
     * @return
     */
    public double checkOut(MotelRoom room, int days, String pay) {
        //must figure out how to determine index of room. maybe assign a private int to save the room's index?
    	return room.getPrice() * days;
    }

    /**
     * Iterates through each room of the RoachMotel and attempts to clean them.
     */
    public void cleanRooms() {
    	for(int index = 0; index < rooms.length; index++) {
    		rooms[index].visit();
    	}
    }
}
