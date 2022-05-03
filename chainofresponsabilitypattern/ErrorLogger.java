package br.com.chainofresponsabilitypattern;

public class ErrorLogger extends Logger {
	
	public ErrorLogger(int levels) {
		this.levels=levels;
	}

	@Override
	protected void displayLogInfo(String msg) {
		// TODO Auto-generated method stub
		System.out.println("ERROR LOGGER INFO: "+ msg);

	}

}
