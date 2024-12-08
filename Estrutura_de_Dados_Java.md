
# Aula: Estrutura de Dados em Java

## O que é uma Estrutura de Dados?

Uma estrutura de dados é uma maneira organizada de armazenar e gerenciar informações para que possam ser usadas de forma eficiente. Elas servem como a base para projetar algoritmos e soluções computacionais mais rápidas e eficazes.

### Por que são importantes?

1. **Desempenho**: Melhoram a eficiência de operações como busca, inserção e exclusão de dados.
2. **Organização**: Facilitam a organização e o acesso aos dados.
3. **Problemas reais**: São usadas em praticamente todas as aplicações de software, desde bancos de dados até sistemas operacionais.

### Tipos comuns de estruturas de dados

1. **Array**: Estrutura linear fixa.
2. **Lista**: Estrutura linear dinâmica.
3. **Mapas (HashMap)**: Armazenamento baseado em pares chave-valor.
4. **Conjuntos (Set)**: Armazenamento exclusivo, onde elementos duplicados não são permitidos.

---

## Arrays em Java

Arrays são estruturas de dados fixas que armazenam elementos do mesmo tipo em locais contíguos na memória.

### Características:
- Tamanho fixo, definido na criação.
- Acesso rápido por índice.

### Exemplo de código:
```java
public class ArrayExample {
    public static void main(String[] args) {
        // Declaração de um array
        int[] numeros = {10, 20, 30, 40, 50};
        
        // Acessando elementos
        System.out.println("Primeiro número: " + numeros[0]);

        // Modificando elementos
        numeros[2] = 35;
        System.out.println("Número na posição 3 atualizado: " + numeros[2]);

        // Iterando com loop
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
```

---

## Listas em Java

As listas são estruturas dinâmicas que podem crescer ou diminuir de tamanho conforme necessário. Em Java, usamos a classe `ArrayList` da biblioteca padrão.

### Características:
- Permitem duplicatas.
- Tamanho dinâmico.
- Acessadas por índice.

### Exemplo de código:
```java
import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        
        // Adicionando elementos
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        // Removendo elemento
        frutas.remove("Banana");

        // Acessando elementos
        System.out.println("Primeira fruta: " + frutas.get(0));

        // Iterando na lista
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
```

---

## Mapas (HashMap) em Java

Os mapas são estruturas baseadas em pares chave-valor. Em Java, utilizamos a classe `HashMap` para trabalhar com mapas.

### Características:
- Rápido acesso por chave.
- Chaves únicas.
- Permite valores duplicados.

### Exemplo de código:
```java
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> idadePorNome = new HashMap<>();
        
        // Adicionando pares chave-valor
        idadePorNome.put("Pedro", 25);
        idadePorNome.put("Maria", 30);
        idadePorNome.put("João", 35);

        // Acessando valores
        System.out.println("Idade do Pedro: " + idadePorNome.get("Pedro"));

        // Removendo um elemento
        idadePorNome.remove("Maria");

        // Iterando sobre os pares chave-valor
        for (String nome : idadePorNome.keySet()) {
            System.out.println(nome + " tem " + idadePorNome.get(nome) + " anos.");
        }
    }
}
```

### Explicação do Código:
1. **`put`**: Adiciona ou atualiza um par chave-valor.
2. **`get`**: Recupera o valor associado a uma chave.
3. **`remove`**: Remove um par chave-valor.
4. **`keySet`**: Retorna todas as chaves presentes no mapa.

---

## Conjuntos (Set) em Java

Os conjuntos são estruturas de dados que armazenam apenas elementos únicos. Em Java, utilizamos a classe `HashSet` para trabalhar com conjuntos.

### Características:
- Não permite duplicatas.
- A ordem dos elementos não é garantida.

### Exemplo de código:
```java
import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> conjunto = new HashSet<>();
        
        // Adicionando elementos
        conjunto.add("A");
        conjunto.add("B");
        conjunto.add("C");
        
        // Tentando adicionar elemento repetido
        conjunto.add("A");
        
        // Iterando no conjunto
        for (String elemento : conjunto) {
            System.out.println(elemento);
        }
    }
}
```

---

## Conclusão

Nesta aula, aprendemos:
1. O que são estruturas de dados e sua importância.
2. Como trabalhar com arrays, listas, mapas e conjuntos em Java.
3. Diferenças e usos de cada estrutura.

### Próximos passos:
- Praticar com os exemplos fornecidos.
- Estudar outras estruturas, como árvores e grafos, para problemas mais avançados.
