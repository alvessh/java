# Aula: Introdução à Lógica de Programação

## 1. Introdução à Lógica de Programação

**Definição**:
- **Lógica de Programação** é um conjunto de técnicas e princípios que ajudam a resolver problemas através da criação de algoritmos. É a base para a programação em qualquer linguagem.

**Importância**:
- Estruturar o pensamento.
- Desenvolver habilidades para resolver problemas complexos.
- Facilitar a transição entre diferentes linguagens de programação.

**Exemplos do dia a dia**:
- Seguir uma receita de bolo (passos sequenciais).
- Planejar um dia de trabalho (priorização de tarefas).

---

## 2. Estruturas Lógicas Básicas

**Estruturas de Controle**

**Condicionais:**

 - Permitem executar um bloco de código se uma condição for verdadeira.

- Sintaxe:

```plaintex

se (condição) então
    // código a ser executado
senão
    // código alternativo
```

- Exemplo:

    Verificar se uma pessoa é maior de idade

```plaintext

        se (idade <= 18) então
            imprimir "A pessoa é de menor"
        senão 
            imprimir "A pessoa é de maior"
```

**Loops:**

- Permitem repetir um bloco de código várias vezes.

- Sintaxe:

```plaintext

para (inicialização; condição; atualização) {
    // código a ser executado
}
```

Exemplo:

Contar de 1 a 10:

```plaintext

        para (i = 1; i <= 10; i++) {
            imprimir i
        }
```

**Atividade:**

    Criar um pseudocódigo que imprima os números de 1 a 5.
    Criar um pseudocódigo que imprima os números de 20 a 20000.

## 3. Variáveis e Tipos de Dados

**Variáveis**

Definição: Local para armazenar dados que podem ser usados e manipulados em um programa.
Exemplo de declaração:

```plaintext

    numero = "5"
    nome = "João"
```

**Tipos de Dados**

- Inteiros: Números sem casas decimais (ex: 5, -2).
- Flutuantes: Números com casas decimais (ex: 3.14, -0.5).
- Strings: Sequências de caracteres (ex: "Olá, mundo!").
- Booleanos: Verdadeiro ou falso (ex: true, false).

Atividade:

Definir variáveis para armazenar o nome, casado, idade e altura de um usuário:

```plaintext
    nome = "Itamar"
    idade = 25
    altura = 1.75
    genero = "M"
    casado = true
    cnh = false
```

### 4. Algoritmos

**Definição de Algoritmo**

Conjunto de instruções sequenciais que resolvem um problema específico.

**Representação de Algoritmos**

- Pseudocódigo: Forma simples de descrever um algoritmo utilizando uma linguagem próxima à natural.

- Fluxogramas: Representação visual que utiliza símbolos gráficos para descrever a lógica do algoritmo.

Atividade:

Escrever um algoritmo em pseudocódigo para a tarefa de fazer um sanduíche:

```plaintext

1. Pegar 2 fatias de pão.
2. Adicionar manteiga nas fatias.
3. Colocar presunto e queijo entre as fatias.
4. Fechar o sanduíche.
5. Servir.

```
### 5. Exercícios Práticos

- Exercício 1: Criar um algoritmo que calcula a soma de dois números.

```plaintext

1. Ler numero1
2. Ler numero2
3. soma = numero1 + numero2
4. Imprimir soma
```

- Exercício 3: Criar um algoritmo que classifica a idade de uma pessoa.

```plaintext

1. Ler idade
2. se idade <= 12 então
      imprimir "Criança"
   senão se idade < 18 então
      imprimir "Adolescente"
   senão
      imprimir "Adulto"
```

## 6. Encerramento e Revisão

Revisão dos principais pontos:

- Lógica de programação.
- Estruturas de controle.
- Variáveis e tipos de dados.
- Algoritmos.

---
- O que é uma variável?
- Como funciona uma estrutura condicional?
- O que é um algoritmo?
