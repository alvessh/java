package br.com.poo;

class Carro extends Veiculo{
	private String marca;
	private String modelo;
	private int ano;

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setAno(int ano) {
		if (ano > 1885) { // Primeiro carro foi inventado em 1886
			this.ano = ano;
		}
	}

	public int getAno() {
		return ano;
	}
	
	@Override
    void mover() {
        System.out.println("O carro esta rodando na estrada");
    }

	public void exibirInformacoes() {
		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Ano: " + getAno());
		System.out.println("Cor: " + super.getCor());
		
		mover();
	}
}