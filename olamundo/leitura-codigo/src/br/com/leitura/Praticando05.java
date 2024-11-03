package br.com.leitura;

public class Praticando05 {

	public static void main(String[] args) {
		String nome = "Batata";
		
		for (int i =-10; i <= 10; i++) {
			System.out.println(i);
			i = ((i + 10) - 10);
			
			System.out.println(i + "!Arroz");
			if (i < -10) {
				i = -10;
				
				if (i == -10) {
					System.out.println("Oi");
					
					i = -10;
					
					if (i != -10) {
						System.out.println("Oi 2");
					}
				}
			}
			
			i = (100 / 10) + 1;
		}
		
		int opcao = 1;
		if (!(!(nome.equals("Batata"))) && !(!(opcao == 1))) {
			System.out.println(nome + " - " + nome + " !");
		}
	}
}
