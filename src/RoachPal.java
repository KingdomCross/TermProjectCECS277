
public class RoachPal implements Payment {
	private String name;
	private String email;
	public RoachPal(String name, String email) {
		this.name = name;
		this.email = email;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void pay(double amount, RoachLedger ledger) {
		ledger.payment(this, amount);

	}
	
	public String getMethod() {
		return "RoachPal";
	}

}
