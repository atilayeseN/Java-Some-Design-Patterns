
public class RequestProxy implements IRequest{
private Request rq=null;

@Override
public String[] getRequests() {
	rq=new Request();
	
	return rq.getRequests();
	
	
}
}
