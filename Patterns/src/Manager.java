import java.util.ArrayList;
import java.util.List;

public class Manager implements Subject,Message,Visitor {
	  
	   private String name;
	   private static Manager instance = new Manager();
	   private List<Client> client=new ArrayList<>();

	  
	   private Manager(){}
	   public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static Manager getInstance(){
	      return instance;
	   }

	   public void order(){
	      System.out.println("GetBackToWork!!!!!");
	   }
	   public void meet() {
		   System.out.println("Meeting time");
	   }
	   @Override
	public void newClient(Client cl) {
		   client.add(cl);
	   }
	   @Override
	public void deleteClient(Client cl) {
		   client.remove(cl);
	   }
	   @Override
	public void notifyDiscouny() {
		   for (Observer cli: client) {
			   cli.update();
		   }
	   }
	   @Override
	public void doneWork(Observer cl) {
		   int flag=0;
		   for(Client cls:client) {
			   if(cl ==cls) {
				   flag++;
			   }
		   }
		   if(flag>0) {
			   cl.done();
		   }
	   }
	
	public void sendOrder(Order or,Accountant ac) {
		ac.takeOrder(or);
	}
	@Override
	public void sendMessage(String message) {
		ChatRoom.showMessage(this.name, message);
		
	}
	@Override
	public void visit(Frontend frontend) {
		System.out.println("Displaying frontend's computer");
		
	}
	@Override
	public void visit(Backend backend) {
		System.out.println("Displaying backend's computer");
		
	}
	@Override
	public void visit(Accountant accountant) {
		System.out.println("Displaying accountant's computer"); 
		
	}
	@Override
	public void visit(Developers developers) {
		System.out.println("Displaying screen");
	}
	
	
  
}
