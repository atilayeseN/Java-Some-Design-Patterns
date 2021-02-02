
public class LicenceStock {
	private String name = "WindowsLicence";
	   private int quantity = 10;

	   public void buy(){
	      System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
	   }
	   public void discard(){
	      System.out.println("Stock [ Name: "+name+",   Quantity: " + quantity +" ] discarded");
	   }

}
