package br.com.estrutura;

import java.util.HashMap;
import java.util.Map;

public class Pessoa {
	public static void main(String[] args) {
		Map<String, String> pessoaMap = new HashMap<String, String>();
		
		pessoaMap.put("0001", "Itamar");
		pessoaMap.put("0002", "Emilly");
		pessoaMap.put("0003", "Brunna");
		pessoaMap.put("0004", "Elemar");
		
//		System.out.println(pessoaMap.get("0002"));
		
		for (String chave : pessoaMap.keySet()) {
			System.out.println(pessoaMap.get(chave));
		}

	}
}
