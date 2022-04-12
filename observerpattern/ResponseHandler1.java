package br.com.observerpattern;

import java.util.Observable;
import java.util.Observer;

public class ResponseHandler1 implements Observer {
	
	private String resp;

	@Override
	public void update(Observable o, Object arg) {
		if (arg instanceof String) {
			resp = (String) arg;
			System.out.println("\nHandler1 Received Response :" + resp);
		}
		
	}

}
