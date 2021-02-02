
public class Pound implements Money{
private double quantity;
private double value=10.15;
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
