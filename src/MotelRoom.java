public interface MotelRoom {
	public void visit();
	public boolean isDisturbable();
	public void setDisturbable(boolean dist);
	public int getPrice();
	public RoachColony getResident();
	public boolean isVacant();
}
