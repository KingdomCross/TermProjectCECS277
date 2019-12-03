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
	private ArrayList<Customer> waitList;
	private RoomBuilder builder;
	private MotelRoom[] rooms;
	private MotelRoomVisitor maid;
	private RoachLedger ledger;
	
	private RoachMotel() {
		this.vacancy = true;
		this.waitList = new ArrayList<Customer>();
		this.builder = new RoomBuilder();
		this.rooms = new MotelRoom[10];
		this.maid = new Maid();
		this.ledger = new RoachLedger();
	}
	
	private RoachMotel(int numRooms) {
		this.vacancy = true;
		this.waitList = new ArrayList<Customer>();
		this.builder = new RoomBuilder();
		this.rooms = new MotelRoom[numRooms];
		this.maid = new Maid();
		this.ledger = new RoachLedger();
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
     * @param colony the RoachColony attempting to check in
     * @param roomType the type of room the RoachColony is attempting to check into (Regular, Deluxe, Suite)
     * @param amenities the type of amenities wanted with the room (FoodBar, RefillBar, Shower, Spa)
     * @return the MotelRoom that the RoachColony is checked into, or a vacant room if the RoachMotel is not vacant
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
    
    public String ledgerToString() {
    	return ledger.toString();
    }
    /**
     * Calculates the price of the argument room's visit and charges the appropriate account based on the argument String.
     * @param room the MotelRoom being checked out
     * @param days the number of days the MotelRoom being checked out was resided in
     * @param payment the method of payment 
     * @return the price of the motel room stay
     */
    public double checkOut(MotelRoom room, int days, Payment payment) {
    	rooms[room.getRoomNumber()] = builder.buildVacantRoom();
    	this.updateVacancy();
    	payment(payment,room.getPrice()*days);
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
    
    public void payment(Payment pay, double amount) {
    	pay.pay(amount,ledger);
    }
    
    /**
     * Iterates through the room list to and checks if room is Vacant
     * If so, update the RoachColinies on the waitList
     */
    private void updateVacancy() {
    	for(int index = 0; index < rooms.length; index++) {
    		if(rooms[index].isVacant()) {
    			this.vacancy = true;
    			for (Customer r : waitList) r.update();
    			waitList.clear();
    			return;
    		}
    	}
    	this.vacancy = false;
    }
}
