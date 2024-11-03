package br.com.leitura;

public class Praticando04 {

	public static void main(String[] args) {
		String nome = "Arroz";
		
		nome = "Batata";
		
		for (int i =-5; i < 0; i = i + 1) {
			System.out.println(i);
			i = i + 2;
			
			if (i == -2) {
				i = i - 2;
			}
		}
		
		if (!(nome.equals("Batata"))) {
			System.out.println(nome + " - " + nome + " !");
		}
	}
}
