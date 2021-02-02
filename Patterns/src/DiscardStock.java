
public class DiscardStock implements Order{

	private LicenceStock stock;

	   public DiscardStock(LicenceStock licstock){
	      this.stock = licstock;
	   }

	   public void execute() {
	      stock.discard();
	   }
}
