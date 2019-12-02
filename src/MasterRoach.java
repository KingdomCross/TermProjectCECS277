
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
	
	public void pay(double amount, RoachLedger ledger) {
		ledger.masterPayment(this, amount);

	}
	
	public String getName() {
		return name;
	}

}
