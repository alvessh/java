package br.com.olamundo;
import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Tabuada tabuada = new Tabuada();
		tabuada.inicia(tabuada);
	}

	private void inicia(Tabuada tabuada) {
		int opcaoPrincipal = tabuada.menuPrincipal();

		String operador = tabuada.defineOperador(opcaoPrincipal);

		int opcao = tabuada.menu();
		tabuada.defineOpcao(tabuada, opcao, operador);
	}

	private void defineOpcao(Tabuada tabuada, int opcao, String operador) {
		if (opcao == 1) {
			tabuada.calculaTabuadaDe1A10(operador);
		} else if (opcao == 2) {
			int numero = tabuada.pedeNumeroAoUsuarioERetornaONumero();
			tabuada.calculaTabuadaPorNumeroInformado(numero, operador);
		} else {
			System.out.println("Você digitou uma opção inválida!");
			System.out.println("Por favor, informe uma opção válida.");
		}
	}

	private String defineOperador(int opcaoPrincipal) {
		String operador = "N#D";
		if (opcaoPrincipal == 1) {
			operador = "+";
		} else if (opcaoPrincipal == 2) {
			operador = "-";
		} else if (opcaoPrincipal == 3) {
			operador = "*";
		} else if (opcaoPrincipal == 4) {
			operador = "/";
		} else {
			System.out.println("Você digitou uma opção inválida!");
		}
		
		return operador;
	}

	public void calculaTabuadaPorNumeroInformado(int numeroInformado, String operador) {
		for(int i = 1; i <= 10; i++) {
			int resultado = calc(numeroInformado, operador, i);

			System.out.println(numeroInformado + operador + i + " = " + resultado);
		}
	}

	public void calculaTabuadaDe1A10(String operador) {
		for (int y = 1; y <= 10; y++) {
			System.out.println("============ TABUADA DO: " + y + "================");
			for(int i = 1; i <= 10; i++) {
				int resultado = calc(y, operador, i);

				System.out.println(y + operador + i + " = " + resultado);
			}
			System.out.println("============================");
		}
	}

	private int calc(int y, String operador, int i) {
		int resultado = 0;

		if (operador.equals("+")) {
			resultado = y + i;
		} else if (operador.equals("-")) {
			resultado = y - i;
		} else if (operador.equals("*")) {
			resultado = y * i;
		} else if (operador.equals("/")) {
			resultado = y / i;
		} else {
			System.out.println("Operação inválida!");
		}

		return resultado;
	}

	public int pedeNumeroAoUsuarioERetornaONumero() {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o número que deseja calcular: ");
		int numero = teclado.nextInt();

		return numero;
	}

	public int menu() {
		System.out.println("Informe as opções: ");
		System.out.println("1 - Calcular tabuada completa (de 1 a 10).");
		System.out.println("2 - Escolher número para calcular.");

		Scanner teclado = new Scanner(System.in);
		int opcao = teclado.nextInt();

		return opcao;
	}

	public int menuPrincipal() {
		System.out.println("Olá, seja bem vindo ao tabuadaaqui.com");
		System.out.println("Escolha a operação que deseja realizar: ");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");

		Scanner teclado = new Scanner(System.in);
		int opcao = teclado.nextInt();

		System.out.println("==================================================");
		return opcao;
	}
}
