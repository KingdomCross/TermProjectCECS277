public class RoachColony {
	private String name;
	private int init_pop;
	private double growth;
	
	public RoachColony() {
		this.name = "Empty colony";
		this.init_pop = 0;
		this.growth = 0;
	}
	
    public RoachColony(String name, int init_pop, double growth) {
    	this.name = name;
    	this.init_pop = init_pop;
    	this.growth = growth;
    } //Customer

    public void party(boolean hasShower) {
    	this.init_pop *= this.growth;
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
    
    public String getName() {
    	return this.name;
    }
    
    public int getPopulation() {
    	return this.init_pop;
    }
}
