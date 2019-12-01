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
	protected int days;
	protected boolean doNotDisturb;
	protected boolean vacancy;
	
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
		return this.vacancy;
	}
	
	public void passDay() {
		this.days++;
		resident.party(false);
	}
	
	public void passDay(boolean hasShower) {
		this.days++;
		resident.party(hasShower);
	}
	
	public int getDays() {
		return this.days;
	}
}
