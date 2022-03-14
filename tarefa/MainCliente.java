package br.com.gustavo.tarefa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainCliente {

	public static void main(String[] args) throws IOException {
		Fabrica fabrica = new Fabrica();
		
		System.out.println("\n ##### OPÇÕES DE TRANSPORTE ##### "
				+ "\n\n      Caminhão"
				+ "\n      Navio"
				+ "\n\n --> Escolha a Forma de Envio:");
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		String tipoEnvio = buff.readLine();
		
		Transporte userPlan = fabrica.t(tipoEnvio);
	
		userPlan.deliver();
		
	}
	
}
