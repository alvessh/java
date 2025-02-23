package br.com.poo2;

public class Circulo extends Forma{

	private double raio;
	
	public Circulo() {
	}
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return this.raio;
	}

	@Override
	double calcularArea() {
		return Math.PI * raio * raio;
	}

}
