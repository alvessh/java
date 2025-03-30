package br.com.brincando;

import java.util.Scanner;

public class Apresentacao {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Olá, digite o seu nome por favor: ");
		String nome = teclado.nextLine();
		
		System.out.println("Olá, digite a sua idade por favor: ");
		int idade = teclado.nextInt();
		
		System.out.println("=================================");
		System.out.println("Olá, :" + nome);
		System.out.println("Parabéns, você completou a primera aula!");
		System.out.println("Que legal, que você tem: " + idade + " anos!");
	}
}
