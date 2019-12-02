public interface Payment {
	public String getName();
	void pay(double amount, RoachLedger ledger);
	public String getMethod();
}
