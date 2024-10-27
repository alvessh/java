package br.com.olamundo;
import java.util.Scanner;

public class CadastroPessoa {
	public static void main(String[] args) {
		OlaMundo ola = new OlaMundo();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Por favor, Informe o seu nome: ");
		String nome = teclado.nextLine();
		
		System.out.println("Informe sua idade: ");
		int idade = teclado.nextInt();
		
		teclado.nextLine();
		
		System.out.println("Informe seu genero: ");
		String genero = teclado.nextLine();
		
		System.out.println("Informe sua altura: ");
		double altura = teclado.nextDouble();
		
		ola.cadastrarPessoa(nome, idade, genero, altura);
	}
}
