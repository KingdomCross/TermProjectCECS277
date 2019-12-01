import java.util.ArrayList;

/**
 * Superclass for motel rooms.
 * Acts as an interface that also requires classes to inherit a boolean doNotDisturb.
 * @author ???
 *
 */
public abstract class MotelRoom {
	protected RoachMotel motel;
	protected int price;
	private boolean doNotDisturb = false; 
    public void setDoNotDisturb(boolean dn) {
    	this.doNotDisturb = dn;
    }
    public boolean getDoNotDisturb() {
    	return this.doNotDisturb;
    }
    public abstract void update();
}
