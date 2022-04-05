package br.com.adapterpattern;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		CreditCard targetInterface = new BankCustomer();
		targetInterface.giveBankDetails();
		System.out.print(targetInterface.gerCreditCard());

	}

}