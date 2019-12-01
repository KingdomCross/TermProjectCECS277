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

    public void party() {
    }
}
