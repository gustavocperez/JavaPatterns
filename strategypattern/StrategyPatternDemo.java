package br.com.strategypattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrategyPatternDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the first value: ");
		float value1=Float.parseFloat(br.readLine());
		System.out.println("Entre com o segundo valor: ");
		float value2=Float.parseFloat(br.readLine());
		
		Context context = new Context(new Addition());
		System.out.println("Soma = " + context.executeStrategy(value1, value2));
		
		context = new Context(new Subbtration());
		System.out.println("Subtração = " + context.executeStrategy(value1, value2));
		
		context = new Context(new Multiplication());
		System.out.println("Multiplicação = " + context.executeStrategy(value1, value2));

	}

}
