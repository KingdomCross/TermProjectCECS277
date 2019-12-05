/**
 * Sets functionality of Payment types
 * @author ???
 * Inuput: none
 * Output: none
 */
public interface Payment {
	public String getName();
	void pay(double amount, RoachLedger ledger);
	public String getMethod();
}
