package br.com.olamundo;

public class OlaMundo {
	public static void correr(String comida) {
		System.out.println(mensagem() + comida);
	}
	
	public static String mensagem() {
		return "Terminei de correr e agora vou comer: ";
	}
	
	public void cadastrarPessoa(String nome, int idade, String genero, double altura) {
		System.out.println(nome + " cadastro com sucesso!");
		System.out.println("Dados cadastrados: ");
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Genero: " + genero);
		System.out.println("Altura: " + altura);
	}
}