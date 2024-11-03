package br.com.olamundo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CadastroPessoa2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Menu: ");
		System.out.println("1 - Cadastrar uma pessoa");
		System.out.println("2 - Listar pessoas cadastradas");
		System.out.println("3 - Sair");
		int opcao = teclado.nextInt();
		teclado.nextLine();

		if (opcao == 1) {
			cadastrarPessoa();
		} else if (opcao == 2) {
			listarPessoas("Informacoes_Pessoais");
		} else if (opcao == 3) {
			System.out.println("Saindo...");
		} else {
			System.out.println("Opção inválida.");
		}
	}

	public static void salvarInformacoes(String nomeArquivo, String conteudo) {
		try (FileWriter writer = new FileWriter(nomeArquivo + ".txt")) {
			writer.write(conteudo);
		} catch (IOException e) {
			System.out.println("Erro ao salvar informações em: " + nomeArquivo + " " + e.getMessage());
		}
	}

	public static void cadastrarPessoa() {
		Scanner teclado = new Scanner(System.in);

		StringBuilder informacoesPessoais = new StringBuilder();

		informacoesPessoais.append("Nome completo: ");
		
		System.out.print("Nome completo: ");
		String nome = teclado.nextLine();
		informacoesPessoais.append(nome);
		informacoesPessoais.append("\n");

		String nomeArquivo = "Informacoes_Pessoais";
		salvarInformacoes("Informacoes_Pessoais", informacoesPessoais.toString());

		System.out.println("Cadastro concluído para: " + nomeArquivo);
	}

	public static void listarPessoas(String nomeArquivo) {
        File arquivo = new File(nomeArquivo + ".txt");

        if (arquivo.exists()) {
            System.out.println("Pessoas cadastradas:");

            try (Scanner scanner = new Scanner(arquivo)) {
            	for (; scanner.hasNextLine(); ) {
                    System.out.println(scanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
            }
        } else {
            System.out.println("Nenhuma pessoa cadastrada.");
        }
    }
}