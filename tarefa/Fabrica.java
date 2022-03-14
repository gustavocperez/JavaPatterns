package br.com.gustavo.tarefa;

public class Fabrica {
	
	public Transporte t (String tipoEnvio) {
		
		if(tipoEnvio.equalsIgnoreCase("Caminhao")) {
			return new Caminhao();
		}
		
		else if (tipoEnvio.equalsIgnoreCase("Navio")) {
			return new Navio();
		}
		
		// Tratamento de Erros, caso nao seja String dará um error
		else return null;
	}

}
