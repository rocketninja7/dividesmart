class Transaction {
	private People payee;
	private People[] payer;
	private String currency;
	private double amount;

	public Transaction(String currency, double amount, People payee, People[] payer){
		this.currency = currency;
		this.amount = amount;
		this.payee = payee;
		this.payer = payer;
	}

	public void updatePeople() {
		double splitAmount = amount/payer.length;
		for(People p: payer){
			p.addAmountOwed(payee, currency, amount);
		}
	}
}