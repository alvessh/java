package br.com.poo2;

public class Main {
	public static void main(String[] args) {
//		Animal meuCachorro = new Cachorro();
//		meuCachorro.emitirSom();

		Circulo c = new Circulo();
		c.setRaio(1);
		c.exibirTipo();
		System.out.println("Área do círculo de um raio de: "+ c.getRaio() + " é: " + c.calcularArea());
	}
}
