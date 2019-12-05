/**
 * Creates the RoachColony and Handles all it's functionalities
 * @author ???
 * Input: takes the RoachColony name, initual population, and growthRate
 * Output: Creates a RoachColony Object
 */

public class RoachColony implements Customer{
	private String name;
	private int init_pop;
	private double growth;
	private MotelRoom room;
	/**
	 * Default Constructor
	 */
	public RoachColony() {
		this.name = "Empty colony";
		this.init_pop = 0;
		this.growth = 0.0;
	}
	/**
	 * Constructor for Roach Colony
	 * @param name name of colony
	 * @param init_pop initial population
	 * @param growth growth rate
	 */
    public RoachColony(String name, int init_pop, double growth) {
    	this.name = name;
    	this.init_pop = init_pop;
    	this.growth = growth;
    } 
    /**
     * The Roaches throw a party, population grows and then decreases based on if the Amenity Shower was
     * purchased
     */
	public void party() {
    	this.init_pop *= this.growth/100;
    	System.out.println(this.name + " partied and grew %" + this.growth);
    	if(room.hasShower()) {
    		this.init_pop *= 0.75;
    		System.out.println(this.name + " has a shower, and population therefore decreased by 25%.");
    	}
    	else {
    		this.init_pop *= 0.5;
    		System.out.println(this.name + " does not have a shower, and population therefore decreased by 50%.");
    	}
		
	}

	/**
     * return the name of the Colony
     * @return this RoachColony's name
     */
    public String getName() {
    	return this.name;
    }
    
    /**
     * returns the population of the Colony
     * @return the population of the RoachColony
     */
    public int getPopulation() {
    	return this.init_pop;
    }
    
    /**
     * Displays room availability when notified by the RoachMotel
     */
    public void update()
    {
    	System.out.println("Room Available");
    }
    /**
     * Makes string of object
     */
    @Override
    public String toString() {
    	return String.format("\n    Colony Name: %s\n    Population: %d\n    Growth Rate: %.2f%%", this.name, this.init_pop, this.growth);
    }
    /**
     * getter for room
     * @return returns assigned room
     */
	public MotelRoom getRoom() {
		return room;
	}
	/**
	 * setter for the Room
	 * @param newRoom room assigned to roachColony
	 */
	public void setRoom(MotelRoom newRoom) 
	{
		// TODO Auto-generated method stub
		room = newRoom;
		
	}

	}


