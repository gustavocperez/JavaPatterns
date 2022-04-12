package br.com.strategypattern;

public class Multiplication implements Strategy {

	@Override
	public float calculation(float a, float b) {
		
		return a*b;
	}

}
