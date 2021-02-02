
public class AndroidDevelopDecorator extends PartDecorator{

	public AndroidDevelopDecorator(SoftwarePart decoratedPart) {
		super(decoratedPart);
		// TODO Auto-generated constructor stub
	}
	public void develop() {
		decoratedPart.develop();
		setAndroidDevelopement(decoratedPart);
    }
	private void setAndroidDevelopement(SoftwarePart decoratedPart) {
		System.out.println("Development Platform: Android");
	}

}
