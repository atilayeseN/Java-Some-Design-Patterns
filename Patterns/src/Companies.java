
public class Companies implements Container{
   public String compaines[]= {"ALi.aþ","Veli.aþ","Sabancý.aþ"};
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new NameIterator();
	}
    public class NameIterator implements Iterator {
        int index;
		@Override
		public boolean hasNext() {
			if(index<compaines.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()){
	            return compaines[index++];
	         }
			return null;
		}
    	
    }
}	
