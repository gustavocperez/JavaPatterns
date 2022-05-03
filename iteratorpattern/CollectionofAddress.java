package br.com.iteratorpattern;

public class CollectionofAddress implements Container {
	
	public String address[]= {"Ceu", "Coordenacao", "ProReitoria", "Trabalho", "Campo Grande"};
	

	@Override
	public Iterator getIterator() {
		return new CollectionofAddressIterate();
	}
	
	private class CollectionofAddressIterate implements Iterator {
		
		int i;
		
		public boolean hasNext() {
			if (i < address.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return address[i++];
			}
			
			return null;
		}
		
	}
	
}
