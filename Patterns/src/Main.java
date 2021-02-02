import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//Singleton
		Manager boss=Manager.getInstance();
		boss.setName("XYZ Software");
		boss.order();
		//Decorator
		SoftwarePart backend=new Backend();
		SoftwarePart frontend=new Frontend();
		SoftwarePart backendWeb=new WebDevelopDecorator(new Backend());
		SoftwarePart frontendWeb=new WebDevelopDecorator(new Frontend());
		SoftwarePart backendAndroid=new AndroidDevelopDecorator(new Backend());
		backend.develop();
		frontend.develop();
		backendWeb.develop();
		frontendWeb.develop();
		backendAndroid.develop();
		//Strategy
		double account=2000;
		Accountant act=new Accountant(new AddToAccount());
        System.out.println("New account: "+act.executeOperation(account, 200000));
        account=act.executeOperation(account, 200000);
        Accountant act2=new Accountant(new SubstractFromAccount());
        System.out.println("New account: "+act2.executeOperation(account, 3000));
        //Observer
        System.out.println("-----");
        Client cl1=new Client("Atýlay", null, null);
        Client cl2=new Client("Gecelerin yargýcý", null, null);
        Client cl3=new Client("Mekansýz serseri", null, null);
        boss.newClient(cl1);
        boss.newClient(cl2);
        boss.newClient(cl3);
        boss.deleteClient(cl2);
        boss.doneWork(cl2);
        boss.doneWork(cl3);
        //Command 
        System.out.println("-----");
        LicenceStock stock=new LicenceStock();
        BuyStock buy=new BuyStock(stock);
        DiscardStock dsc=new DiscardStock(stock);
        Accountant ac=new Accountant();
        boss.sendOrder(buy, ac);
        boss.sendOrder(dsc, ac);
        ac.placeOrders();
        //Adapter
        Client cl4=new Client("Qral", null, null);
        System.out.println(cl4.PaymentResult("111-111", 200));
        //Factory
        try {
        	ElectronicArchive earsiv=(ElectronicArchive) Backend.createSoftware(ElectronicArchive.class);
        	earsiv.since(2015);
        	earsiv.type();
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        //Abstract Factory
        try {
        	Money dolar=Accountant.getMoney(new DolarFactory());
        	((Dolar) dolar).setQuantity(10);
        	Money pound=Accountant.getMoney(new PoundFactory());
    
        	
        	System.out.println(pound.getValue());
        
        	
        	System.out.println(dolar.getValue());
     
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        //Facade
        Frontend shop=new Frontend();
        System.out.println("what do you want to buy: ");
        System.out.println("1:Web Template 2:Logo");
        Scanner scn=new Scanner(System.in);
        int a= scn.nextInt();
        if(a==1) {
        	shop.templateSale();
        }
        else if(a==2) {
        	shop.logoSale();
        }
        //Composite Pattern
        Frontend newf = new Frontend();
        newf.setName("Atýlay");
        Backend bc=new Backend();
        bc.setName("At");
        Accountant ac3=new Accountant();
        ac3.setName("AtýlKurt");
        
        Manager mng=Manager.getInstance();
        mng.setName("Boss");
        Employee Boss=new Employee(mng.getName(),mng.getClass().getName(),20000);
        Employee backnedci=new Employee(bc.getName(),bc.getClass().getName(),8000);
        Employee frontendci=new Employee(newf.getName(),newf.getClass().getName(),8000);
        Employee muhasebe=new Employee(ac3.getName(),ac3.getClass().getName(),8000);
        Employee logocu=new Employee("Faruk","Frontend",5000);
        Boss.add(backnedci);
        Boss.add(frontendci);
        Boss.add(frontendci);
        Boss.add(muhasebe);
        frontendci.add(logocu);
        
        for (Employee headEmployee : Boss.getSubordinates()) {
            System.out.println(headEmployee);
            
            for (Employee employee : headEmployee.getSubordinates()) {
               System.out.println(employee);
            }
         }
        //Iterator
        Companies comp=new Companies();
        for(Iterator iter=comp.getIterator();iter.hasNext();) {
        	String companies = (String)iter.next();
            System.out.println("Name : " + companies);
        }
        //Memento
        Backend bc1=new Backend();
        CareTaker ct=new CareTaker();
        bc1.setTodo("Crud");
        bc1.setTodo("Müslüm.AÞ stok takip");
        ct.add(bc1.saveTodoToMemento());
        
        bc1.getStateFromMemento(ct.get(0));
        System.out.println(bc1.getTodo());
        //Template Method
       Server apache=new ApacheTomcat();
       apache.initialize();
       apache.startServer();
       apache.shutdownServer();
       //Mediator
       Manager m=Manager.getInstance();
       bc1.setName("Backendci");
       m.sendMessage("Selamýn aleyküm");
       bc1.sendMessage("Aleyküm selam");
       //Private data 
       ClientData client=new ClientData("John","Esenyurt", "1111111111");
       System.out.println(client.clientInfo());
       //Visitor
       Manager mng1=Manager.getInstance();
       Workers dev=new Developers();
       dev.accept(mng1);
       //Proxy
       RequestProxy rq=new RequestProxy();
       
      
       
        


	}

}
