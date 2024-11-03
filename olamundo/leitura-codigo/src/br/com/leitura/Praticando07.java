package br.com.leitura;

public class Praticando07 {

	public static void main(String[] args) {
		int i = 100;
		int y = 1;
		if (i == 100 && y == 1) {
			i = 0; 
			y = 100;
			if (i == 1 || y == 100) {
				if (true) {
					i = (1 + 1);
					y = (100 / 2);
					
					if (true && i == 2 && y == 50) {
						for (int jota = 50; jota == 50; jota = jota + 2) {
							System.out.println(jota);
							
							if (jota == 50) {
								jota = 100;
								if (jota == 100 || false) {
									if (!false) {
										System.out.println("Olá!");
										jota = 1;
									}
								}
							}
						}
					}
				}
			}
		}
		
	}
}
