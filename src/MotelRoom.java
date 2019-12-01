import java.util.ArrayList;

/**
 * Superclass for motel rooms.
 * Acts as an interface that also requires classes to inherit a boolean doNotDisturb.
 * @author ???
 *
 */
public abstract class MotelRoom {
	//how to implement vacancy indicator??
	//protected RoachMotel motel;
	protected int price;
	protected boolean doNotDisturb = false;
	
	public int getPrice() {
		return this.price;
	}
	public void setDoNotDisturb(boolean dn) {
		this.doNotDisturb = dn;
	}
	public boolean getDoNotDisturb() {
		return this.doNotDisturb;
	}
	//public abstract boolean isVacant();
	public abstract void update();
}
