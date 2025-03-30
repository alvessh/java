package br.com.brincando;

public class Brincando {
	public static void main(String[] args) {
		int inicio = 20;
		inicio +=50;
		inicio -=10;
		inicio *=2;
		inicio /=120;
		
		System.out.println("Valor fim é: " + inicio);
		
		double valor2 = 50.20;
		valor2 -= 0.20;
		
		System.out.println("Valor2 fim é: " + valor2);
		
		int valor3 = inicio;
		
		System.out.println("Valor3 fim é: " + (valor3 * 50));
	}
}
