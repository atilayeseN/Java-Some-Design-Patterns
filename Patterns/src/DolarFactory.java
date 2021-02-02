
public class DolarFactory implements MoneyConvertFactory{

	@Override
	public Money convertMoney() {
		
		return new Dolar();
	}

}
