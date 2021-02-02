
public class ClientData {
private Client client;
public ClientData(String name,String adress,String tc) {
	client=new Client(name,adress,tc);
}
public String clientInfo() {
	String info=client.getName()+client.getAdress()+client.getTc();
	
	return info;
			
}
}
