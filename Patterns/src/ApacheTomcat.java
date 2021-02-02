
public class ApacheTomcat extends Server{

	@Override
	void initialize() {
		System.out.println("Apache Tomcat server initialized");
		
	}

	@Override
	void startServer() {
		System.out.println("Apache Tomcat server started");
		
	}

	@Override
	void shutdownServer() {
		System.out.println("Apache Tomcat server closed");
		
	}

}
