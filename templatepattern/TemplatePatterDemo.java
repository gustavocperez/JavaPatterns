package br.com.gustavo.templatepattern;

import java.util.Scanner;

public class TemplatePatterDemo {
	

	public static void main(String[] args) {
		String jogo="";
		
		do {
		
			System.out.println("Qual jogo deseja jogar?");
			Scanner entrada = new Scanner(System.in);
			jogo = entrada.nextLine();
			Game game;
			
			if(jogo.matches("Xadrez")) {
				game = new Chess();
				game.play();
			};	
			if(jogo.matches("Soccer")) {
				game = new Soccer();
			game.play();
			}	
		
		} while(!jogo.matches("Sair"));

	}

}
