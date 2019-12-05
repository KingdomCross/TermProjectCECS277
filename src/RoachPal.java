/**
 * Class Acts as 1 of 2 Payment methods
 * Strategy Pattern
 * @author ???
 *Input: Takes Roach information and Creates Payment method
 *Output: Writes to ledger as a receipt
 */
public class RoachPal implements Payment {
	private String name;
	private String email;
	/**
	 * Constructor
	 * @param name name on card
	 * @param email email of user
	 */
	public RoachPal(String name, String email) {
		this.name = name;
		this.email = email;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	/**
	 * pays and writes to ledger
	 */
	@Override
	public void pay(double amount, RoachLedger ledger) {
		ledger.payment(this, amount);

	}
	/**
	 * returns method of Payment
	 */
	public String getMethod() {
		return "RoachPal";
	}

}
