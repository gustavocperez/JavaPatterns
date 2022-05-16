package br.com.gustavo.templatepattern;

public class Soccer extends Game {

	@Override
	void initialize() {
		System.out.println("Jogo de Futebol inicializado! Start Playing");

	}

	@Override
	void start() {
		System.out.println("Jogo começou. Bem vindo ao jogo de futebol");

	}

	@Override
	void end() {
		System.out.println("Apito Final!!! Jogo terminou");

	}

}
