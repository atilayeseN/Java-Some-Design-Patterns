
public abstract class PartDecorator implements SoftwarePart{
	protected SoftwarePart decoratedPart;
	public PartDecorator(SoftwarePart decoratedPart){
	      this.decoratedPart = decoratedPart;
	   }
	public void develop() {
		decoratedPart.develop();
	}
	

}
