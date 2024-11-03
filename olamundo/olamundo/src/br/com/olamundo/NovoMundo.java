package br.com.olamundo;

public class NovoMundo {
	public static void main(String [] args) {
		//criar a classe na memória.
		
		String comida = "batata";
		
		OlaMundo ola = new OlaMundo();
		
		OlaMundo.correr(comida);
		ola.cadastrarPessoa(comida, 0, comida, 0);
	}
}
