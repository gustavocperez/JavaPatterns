package br.com.gustavo.facadepattern;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class ClienteMobileShop {
	
	private static int choice;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		do {
			System.out.println("======= Moble Shop ======= \n");
			System.out.println("         1. IPHONE \n");
			System.out.println("         2. SAMSUNG \n");
			System.out.println("         3. BLACKBERRY \n");
			System.out.println("         4. EXIT \n");
			System.out.println("Entre com sua escolha: ");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			choice = Integer.parseInt(br.readLine());
			
			ShopKeeper sk = new ShopKeeper();
			
			switch(choice) {
			case 1:
				sk.iphoneSale();
				break;
			case 2:
				sk.samsungsale();
				break;
			case 3:
				sk.blackberrysale();
				break;
			default:
				System.out.println("Nada foi comprado");
				return;
			
			}
			
		} while (choice != 4);
		

	}

}
