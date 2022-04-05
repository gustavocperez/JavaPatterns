package br.com.adapterpattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard {

	@Override
	public void giveBankDetails() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					
			System.out.println("Entrecom o nome do Holder");
			String customername=br.readLine();
			System.out.print("\n");
			
			System.out.print("Entre com o numero da conta:");
			long accno=Long.parseLong(br.readLine());
			System.out.print("\n");
			
			System.out.print("Entre com o nome do banco :");
			String bankname=br.readLine();
			
			setAccHolder(customername);
			setAccNumber(accno);
			setBankName(bankname);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public String gerCreditCard() {
		long accno=getAccNumber();
		String accholdername=getAccHolder();
		String bname=getBankName();
		return ("A conta numero "+accno+" de "+accholdername+" no "+bname+" banco esta validade e autenticado para uso no cartao de credito.");
	}

}
