
public class IISServer extends Server{

	

	@Override
	void initialize() {
		System.out.println("IIS server initialized");
		
	}

	@Override
	void startServer() {
		System.out.println("IIS server started");
		
	}

	@Override
	void shutdownServer() {
		System.out.println("IIS server closed");
		
	}

}
