
public class BuyStock implements Order{
	private LicenceStock stock;

	   public BuyStock(LicenceStock licstock){
	      this.stock = licstock;
	   }

	   public void execute() {
	      stock.buy();
	   }
}

