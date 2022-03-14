package br.com.gustavo.tarefa;

public class LogisticaTerra extends Logistica {

	public Transporte createTransport() {
		return new Caminhao();
	}
	
}
