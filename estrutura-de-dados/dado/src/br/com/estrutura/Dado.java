package br.com.estrutura;

public class Dado {
	public static void main(String[] args) {
		int [] numeros = new int[10];
		
		int incrementa = 10;
		for (int i =0; i <= 9; i++) {
			numeros[i] = incrementa;

			incrementa += 10;
		}
		
		int soma = 0;
		for (int i = 0; i <=9; i++) {
			soma += numeros[i];
		}
		System.out.println(soma);
		
//		numeros[0] = 10;
//		numeros[1] = 20;
//		numeros[2] = 30;
//		numeros[3] = 40;
//		numeros[4] = 50;
//		numeros[5] = 60;
//		numeros[6] = 70;
//		numeros[7] = 80;
//		numeros[8] = 90;
//		numeros[9] = 100;
//		
//		
		
		int[] arrayNumeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		System.out.println(arrayNumeros[5]);
		
		for (int numero : arrayNumeros) {
			System.out.println(numero);
		}
	}
}
