import java.util.Date;

public class ChatRoom {
	public static void showMessage(String uname, String message){
	      System.out.println(new Date().toString() + " [" + uname + "] : " + message);
	   }
}
