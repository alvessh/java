package br.com.estrutura;

import java.util.List;
import java.util.ArrayList;

public class Fruta {
	public static void main(String[] args) {
		String[] frutas = new String[] {"Maça", "Melancia", "Morango", "Maracujá", "Melão", "Mexirica"};
		
		for (String fruta : frutas) {
			System.out.println("Fruta: " + fruta);
		}
		
		List<String> frutaList = new ArrayList<String>();
		frutaList.add("Maça");
		frutaList.add("Melancia");
		frutaList.add("Morango");
		frutaList.add("Maracujá");
		frutaList.add("Laranja");
		frutaList.add("Melão");
		frutaList.add("manga");
		frutaList.add("Tomate");
		
		System.out.println(frutaList.get(3));
		
		for (String fruta: frutaList) {
			if (fruta.startsWith("M") || fruta.startsWith("m")) {
				System.out.println(fruta);
			}
		}
	}
}
