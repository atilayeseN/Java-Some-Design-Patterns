	
public class Frontend implements SoftwarePart,Message,Workers {
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
private WebTemplate tmp;
private Logo logo;
	@Override
	public void develop() {
		System.out.println("Part: Front-end");
	}
	public Frontend(){  
        tmp= new WebTemplate();  
        logo=new Logo();  
       
    }  
    public void templateSale(){  
       tmp.name();
       tmp.price();
    }  
        public void logoSale(){  
        logo.name();
        logo.price();
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
