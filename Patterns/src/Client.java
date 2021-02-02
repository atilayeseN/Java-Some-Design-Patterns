
public class Client implements Observer{

	private String name;
	private String adress;
	private String tc;
	public Client(String name,String tc,String adress) {
		super();
		this.name = name;
		this.setAdress(adress);
		this.setTc(tc);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void update() {
		System.out.println("We have new discounts");
	}
	@Override
	public void done() {
		System.out.println("Your software is ready");
	}
	
	
	BankTarget bankt=new BankReader();
	
	 public String PaymentResult(String cardNumber, int cost)
     {
         boolean result = bankt.GetPayement(cardNumber, cost);

         if(result)
         {
             return "SUCCESS";
         }
         else
         {
             return "FAIL";
         }
     }
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getTc() {
		return tc;
	}
	public void setTc(String tc) {
		this.tc = tc;
	}
	
	
}
