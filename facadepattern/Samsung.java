package br.com.gustavo.facadepattern;

public class Samsung implements MobileShop {

	@Override
	public void modelNo() {
		System.out.println(" Samsung galaxy tab 3");

	}

	@Override
	public void price() {
		System.out.println("R$ 4500.00");

	}

}
