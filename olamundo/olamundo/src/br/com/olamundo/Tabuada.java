package br.com.olamundo;
import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Tabuada tabuada = new Tabuada();
		int opcao = tabuada.menu();
		
		if (opcao == 1) {
			tabuada.calculaTabuadaDe1A10();
		} else {
			int numero = tabuada.pedeNumeroAoUsuarioERetornaONumero();
			tabuada.calculaTabuadaPorNumeroInformado(numero);
		}
	}

	public void calculaTabuadaPorNumeroInformado(int numeroInformado) {
		for(int i = 1; i <= 10; i++) {
			int resultado = numeroInformado * i;

			System.out.println(numeroInformado + " * " + i + " = " + resultado);
		}
	}

	public void calculaTabuadaDe1A10() {
		for (int y = 1; y <= 10; y++) {
			System.out.println("============ TABUADA DO: " + y + "================");
			for(int i = 1; i <= 10; i++) {
				int resultado = y * i;

				System.out.println(y + " * " + i + " = " + resultado);
			}
			System.out.println("============================");
		}
	}

	public int pedeNumeroAoUsuarioERetornaONumero() {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o número que deseja calcular: ");
		int numero = teclado.nextInt();

		return numero;
	}
	
	public int menu() {
		System.out.println("Olá, seja bem vindo ao tabuadaaqui.com");
		System.out.println("Informe as opções: ");
		System.out.println("1 - Calcular tabuada completa (de 1 a 10).");
		System.out.println("2 - Escolher número para calcular.");
		
		Scanner teclado = new Scanner(System.in);
		int opcao = teclado.nextInt();
		
		return opcao;
	}
}
