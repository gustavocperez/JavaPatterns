package br.com.gustavo.tarefa;

public class LogisticaMar extends Logistica {

	public Transporte createTransport() {
		return new Navio();
	}

}
