
public class Bank {
	public boolean PayementDoer(String cardNumber,int cost) {
		if(cost>1000) {
			return true;
		}
		else {
			return false;
		}
	}

}
