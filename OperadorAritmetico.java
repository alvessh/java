package br.com.brincando;

public class OperadorAritmetico {
	public static void main(String[] args) {
		System.out.println("==============================================================");
		System.out.println("Cálculos utilizando ints");
		System.out.println("==============================================================");

		calculaInt();
		
		System.out.println("==============================================================");
		System.out.println("Cálculos utilizando doubles:");
		System.out.println("==============================================================");

		calculaDouble();
	}

	public static void calculaInt() {
		int valor01 = 50;
		int valor02 = 50;

		int resultadoSoma = valor01 + valor02;
		System.out.println("Resultado adição é: " + resultadoSoma);

		int resultadoSubtração = valor01 - valor02;
		System.out.println("Resultado subtração é: " + resultadoSubtração);

		int resultadoMultiplicao = valor01 * valor02;
		System.out.println("Resultado multiplicação é: " + resultadoMultiplicao);

		int resultadoDivisão = valor01 / valor02;
		System.out.println("Resultado divisão é: " + resultadoDivisão);
	}
	
	public static void calculaDouble() {
		double valor01 = 50.0;
		double valor02 = 1.2;

		double resultadoSoma = valor01 + valor02;
		System.out.println("Resultado adição é: " + resultadoSoma);

		double resultadoSubtração = valor01 - valor02;
		System.out.println("Resultado subtração é: " + resultadoSubtração);

		double resultadoMultiplicao = valor01 * valor02;
		System.out.println("Resultado multiplicação é: " + resultadoMultiplicao);

		double resultadoDivisão = valor01 / valor02;
		System.out.println("Resultado divisão é: " + resultadoDivisão);
	}
}
