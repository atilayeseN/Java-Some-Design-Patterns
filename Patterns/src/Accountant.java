
import java.util.ArrayList;
import java.util.List;

public class Accountant implements Message,Workers{
   private String name;
   public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
private AcountManagement mng;
   public Accountant() {
	   
   }
   public Accountant(AcountManagement mng) {
	   this.mng =mng;
   }
   public double executeOperation(double account, double money){
	      return mng.calculate(account, money);
	      }
   private List<Order> orderList=new ArrayList<Order>();
   public void takeOrder(Order order) {
	   orderList.add(order);
   }
   public void placeOrders() {
	   for(Order order:orderList) {
		   order.execute();
	   }
	   
   }
   public static Money getMoney(MoneyConvertFactory factory) {
	   return factory.convertMoney();
   }
@Override
public void sendMessage(String message) {
	ChatRoom.showMessage(this.name, message);
	
}
@Override
public void accept(Manager mng) {
	mng.visit(this);
	
}
   

}
