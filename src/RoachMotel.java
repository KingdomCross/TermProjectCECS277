import java.util.ArrayList;

/**
 * Represents a Roach Motel with a certain number of rooms and maids.
 * 
 * @author Alexander Dung
 *
 */
public class RoachMotel {
	private static RoachMotel singleMotel;
	private boolean vacancy;
	private ArrayList<RoachColony> waitList;
	private RoomBuilder builder;
	private MotelRoom[] rooms;
	private MotelRoomVisitor maid;
	
	private RoachMotel() {
		this.waitList = new ArrayList<>();
		this.builder = new RoomBuilder();
		this.rooms = new BaseRoom[10];
		this.maid = new Maid();
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
    		rooms[index] = builder.buildVacantRoom();
    	}
    }

    /**
     * If the RoachMotel is vacant, checks the argument RoachColony in to a MotelRoom indicated by the argument String, decorated with the Amenities indicated by the ArrayList of Strings.
     * If the MotelRoom is not vacant, adds the RoachColony to a waitlist to be notified when the RoachMotel is vacant.
     * @param colony
     * @param roomType
     * @param amenities
     * @return
     */
    public MotelRoom checkIn(RoachColony colony, String roomType, ArrayList<String> amenities) {
    	//if the RoachMotel's vacant sign is up:
    	if(this.vacancy) {
    		//instantiate a dummy room
    		MotelRoom newRoom = builder.buildVacantRoom();
    		//go through the MotelRooms
    		for(int index = 0; index < this.rooms.length; index++) {
    			//if a MotelRoom is vacant:
    			if(rooms[index].isVacant()) {
    				//set the dummy room to the specifications
    				newRoom = builder.buildRoom(colony, roomType, amenities, index);
    				//set the vacant MotelRoom to the newly created MotelRoom
    				rooms[index] = newRoom;
    				//check if the RoachMotel is now vacant
    				this.updateVacancy();
    				//stop checking for vacant MotelRooms
    				break;
    			}
    		}
    		//return the newly created MotelRoom
    		return newRoom;
    	}
    	//the RoachMotel is not vacant, therefore:
    	else {
    		//add the RoachColony to the waitlist
    		waitList.add(colony);
    		//return a dummy room
    		return builder.buildVacantRoom();
    	}
    }

    /**
     * Calculates the price of the argument room's visit and charges the appropriate account based on the argument String.
     * @param room
     * @param days
     * @param masterRoach
     * @return
     */
    public double checkOut(MotelRoom room, int days, String pay) {
    	rooms[room.getRoomNumber()] = builder.buildVacantRoom();
    	this.updateVacancy();
    	return room.getPrice() * days;
    }

    /**
     * Iterates through each room of the RoachMotel and attempts to clean them.
     */
    public void cleanRooms() {
    	for(int index = 0; index < rooms.length; index++) {
    		rooms[index].accept(this.maid);
    	}
    }
    
    public boolean isVacant() {
    	return this.vacancy;
    }
    
    private void updateVacancy() {
    	for(int index = 0; index < rooms.length; index++) {
    		if(rooms[index].isVacant()) {
    			this.vacancy = true;
    			return;
    		}
    	}
    	this.vacancy = false;
    }
}
