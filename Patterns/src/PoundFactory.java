
public class PoundFactory implements MoneyConvertFactory{

	@Override
	public Money convertMoney() {
		return new Dolar();
		
	}

}
