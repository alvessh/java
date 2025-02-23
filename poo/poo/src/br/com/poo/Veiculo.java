package br.com.poo;

public class Veiculo {
	private String cor;

	void buzinar() {
		System.out.println("Bii Bii!");
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return this.cor;
	}
	
	void mover() {
        System.out.println("O veiculo esta se movendo");
    }

}
