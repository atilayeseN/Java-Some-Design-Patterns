
public class Dolar implements Money{
private double quantity;
private double value=7.42;
	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return this.quantity*this.value;
	}

	@Override
	public double getQuantity() {
		// TODO Auto-generated method stub
		return this.quantity;
	}
	@Override
	public void setQuantity(double q){
		this.quantity=q;
	}

}
