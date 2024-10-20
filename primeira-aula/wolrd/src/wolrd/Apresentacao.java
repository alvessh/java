package wolrd;

import javax.swing.JOptionPane;

public class Apresentacao {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Qual é o seu nome?");

		JOptionPane.showMessageDialog(null, "Olá, tudo bem, " + nome + "?");
	}
}
