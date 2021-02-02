
public class BankReader implements BankTarget {

	
	
	private Bank bank=new Bank();
	@Override
	public boolean GetPayement(String cardNumber, int cost) {
	    
		
		return this.bank.PayementDoer(cardNumber, cost);
	}

}
