
public class WebDevelopDecorator extends PartDecorator{

	public WebDevelopDecorator(SoftwarePart decoratedPart) {
		super(decoratedPart);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void develop() {
		decoratedPart.develop();
		setWebDevelopement(decoratedPart);
    }
	private void setWebDevelopement(SoftwarePart decoratedPart) {
		System.out.println("Development Platform: Web");
	}
}
