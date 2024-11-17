package br.com.leitura;

import java.util.Scanner;

public class Praticando09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String opcao;
		do {
			System.out.println("Digite S para sair.");
			opcao = scanner.nextLine();

		} while (!opcao.equals("S"));
	}
}
