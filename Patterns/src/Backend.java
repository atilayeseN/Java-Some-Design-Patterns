import java.util.ArrayList;
import java.util.List;

public class Backend implements SoftwarePart,Message,Workers{
	private String name;
	private String todo;

	
	@Override
	public void develop() {
		System.out.println("Part: Back-end");
			
	}
	public static Software createSoftware(Class aClass) throws IllegalAccessException, InstantiationException{
		return (Software) aClass.newInstance();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTodo(String todo){
	      this.todo = todo;
	   }

	   public String getTodo(){
	      return todo;
	   }

	   public Memento saveTodoToMemento(){
	      return new Memento(todo);
	   }

	   public void getStateFromMemento(Memento memento){
	      todo = memento.gettodo();
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
