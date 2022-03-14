package br.com.gustavo.tarefa;

public abstract class Logistica {
		
	abstract Transporte createTransport();
	
	public void planDelivery() {
		createTransport();
	}
}
