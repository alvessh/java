package br.com.olamundo;

import java.util.Scanner;

public class ConverteTemperatura {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Celsius: ");
		double c = teclado.nextDouble();
		
		double f = c * 1.8 + 32; 
		double k = c + 273.15; 
		double re = c * 0.8; 
		double ra = c * 1.8 + 32 + 459.67;
		
		System.out.println("F: " + f);
		System.out.println("K: " + k);
		System.out.println("Re: " + re);
		System.out.println("Ra: " + ra);
	}
}