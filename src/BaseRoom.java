import java.util.ArrayList;

/**
 * Superclass for motel rooms.
 * Contains a RoachMotel for observation purposes, and a member RoachColony, int, and boolean.
 * @author ???
 *
 */
public abstract class BaseRoom implements MotelRoom{
	protected RoachColony resident;
	protected int price;
	protected boolean doNotDisturb;
	
	public abstract void visit();
	public boolean isDisturbable() {
		return this.doNotDisturb;
	}
	public void setDisturbable(boolean dist) {
		this.doNotDisturb = dist;
	}
	public int getPrice() {
		return this.price;
	}
	public RoachColony getResident() {
		return this.resident;
	}
	public boolean isVacant() {
		return this.resident == null;
	}
}
