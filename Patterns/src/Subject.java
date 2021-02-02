
public interface Subject {

	void newClient(Client cl);

	void deleteClient(Client cl);

	void notifyDiscouny();

	void doneWork(Observer cl);


}