/**
 * Sets functionality of MotelRooms 
 * @author ???
 *Input:none
 *Output: none
 */
public interface MotelRoom {
	public boolean isDisturbable();
	public void setDisturbable(boolean dist);
	public int getPrice();
	public RoachColony getResident();
	public int getRoomNumber();
	public boolean isVacant();
	public void passDay();
	public void accept(MotelRoomVisitor visitor);
	public boolean hasShower();
}
