package br.com.poo;

public class Main {
	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		meuCarro.setMarca("Toyota");
		meuCarro.setModelo("Corolla");
		meuCarro.setAno(2021);
		meuCarro.setCor("Bege");

		meuCarro.exibirInformacoes();
	}
}
