/**
 * Class Acts as 1 of 2 Payment methods
 * Strategy Pattern
 * @author ???
 *Input: Takes Roach information and Creates Payment method
 *Output: Writes to ledger as a receipt
 */
public class MasterRoach implements Payment {
	private String name;
	private String code;
	private String card;
	private String date;
	
	public MasterRoach(String name, String card, String code, String date){
		this.name=name;
		this.card=card;
		this.code=code;
		this.date=date;
	}
	/**
	 * Pays the Motel and writes it to ledger
	 * @param amount amount paid
	 * @param ledger  Ledger for the Motel
	 * 
	 */
	public void pay(double amount, RoachLedger ledger) {
		ledger.payment(this, amount);

	}
	/**
	 * returns name on card
	 */
	public String getName() {
		return name;
	}
	/**
	 * returns Method being used
	 */
	public String getMethod() {
		return "MasterRoach";
	}
}
