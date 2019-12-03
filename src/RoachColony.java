public class RoachColony implements Customer{
	private String name;
	private int init_pop;
	private double growth;
	
	public RoachColony() {
		this.name = "Empty colony";
		this.init_pop = 0;
		this.growth = 0.0;
	}
	
    public RoachColony(String name, int init_pop, double growth) {
    	this.name = name;
    	this.init_pop = init_pop;
    	this.growth = growth;
    } //Customer

    /**
     * Simulates the Partying of Roaches, checks if Shower was previously bought
     * Shower dictates how much of the colony is wiped out 
     * @param hasShower
     */
    public void party(boolean hasShower) {
    	this.init_pop *= (1 + this.growth);
    	System.out.println("Colony partied and grew %" + this.growth);
    	if(hasShower) {
    		this.init_pop *= 0.75;
    		System.out.println("Colony has a shower, and population therefore decreased by 25%.");
    	}
    	else {
    		this.init_pop *= 0.5;
    		System.out.println("Colony does not have a shower, and population therefore decreased by 50%.");
    	}
    }
    
    /**
     * return the name of the Colony
     * @return
     */
    public String getName() {
    	return this.name;
    }
    
    /**
     * returns the population of the Colony
     * @return
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
    
    @Override
    public String toString() {
    	return String.format("\n    Colony Name: %s\n    Population: %d\n    Growth Rate: %.2f%%", this.name, this.init_pop, this.growth*100);
    }
    
    public static void main(String args[]) {
    	System.out.println(new RoachColony());
    	System.out.println(new RoachColony("test", 100, 1.0));
    }
}
