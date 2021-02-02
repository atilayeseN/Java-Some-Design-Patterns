
public class ElectronicArchive implements Software{

	@Override
	public void type() {
		System.out.println("E-archive software");
		
	}

	@Override
	public void since(int year) {
		System.out.println("Made in "+year);
		
	}

}
