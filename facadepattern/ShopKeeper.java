package br.com.gustavo.facadepattern;

public class ShopKeeper {
	
	private MobileShop iphone;
	private MobileShop samsung;
	private MobileShop blackberry;
	
	public ShopKeeper() {
		iphone = new Iphone();
		samsung = new Samsung();
		blackberry = new BlackBerry();
	}
	
	public void iphoneSale() {
		iphone.modelNo();
		iphone.price();
	}
	
	public void samsungsale() {
		samsung.modelNo();
		samsung.price();
	}
	
	public void blackberrysale() {
		blackberry.modelNo();
		blackberry.price();
	}
	
}
