package br.com.gustavo.templatepattern;

public class Chess extends Game {

	@Override
	void initialize() {
		System.out.println("Jogo de Xadrez inicializado! Start Playing");

	}

	@Override
	void start() {
		System.out.println("Jogo começou. Bem vindo ao jogo de Xadrez");

	}

	@Override
	void end() {
		System.out.println("Xeque-Mate!!! Jogo terminou");

	}

}
