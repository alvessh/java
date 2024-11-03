package br.com.leitura;

public class Praticando06 {

	public static void main(String[] args) {
		int numero = 50;
		numero += 1;
		numero -= 50;
		numero *= 1;
		numero /= 1;
		
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
			
			if ((i / 2) == 0) {
				System.out.println("Bom dia!");
			}
		}
		
		for (int y = 0; y <= 10; y++) {
			if (y == 0) {
				numero = 100;
				
				numero--;
				--numero;
				
				numero = 0;
				++numero;
				numero++;
				
				System.out.println(--numero);
			}
		}
	}
}
