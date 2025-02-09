# Aula de Programacao Orientada a Objetos (POO) em Java

## Objetivos da Aula
- Compreender os conceitos fundamentais da POO
- Implementar classes e objetos em Java
- Aplicar os princípios de encapsulamento, herança e polimorfismo

---

## 1. Introducao a Programacao Orientada a Objetos
A POO e um paradigma de programacao baseado na modelagem do mundo real utilizando "objetos". Esses objetos possuem atributos (dados) e comportamentos (metodos).

### Principais conceitos:
- **Classe:** Modelo para a criacao de objetos.
- **Objeto:** Instancia de uma classe.
- **Encapsulamento:** Restricao do acesso direto aos atributos.
- **Heranca:** Permite que uma classe herde caracteristicas de outra.
- **Polimorfismo:** Capacidade de um metodo ter diferentes comportamentos.

---

## 2. Criando uma Classe e um Objeto
Vamos criar uma classe simples chamada `Carro`.

```java
class Carro {
    String marca;
    String modelo;
    int ano;
    
    void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.ano = 2022;
        
        meuCarro.exibirInformacoes();
    }
}
```

---

## 3. Encapsulamento
Vamos modificar a classe `Carro` para aplicar o encapsulamento usando **modificadores de acesso** (`private`) e métodos **getters e setters**.

```java
class Carro {
    private String marca;
    private String modelo;
    private int ano;
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setAno(int ano) {
        if (ano > 1885) { // Primeiro carro foi inventado em 1886
            this.ano = ano;
        }
    }
    
    public int getAno() {
        return ano;
    }
}
```

---

## 4. Heranca
Vamos criar uma classe `Veiculo` e fazer `Carro` herdar dela.

```java
class Veiculo {
    String cor;
    
    void buzinar() {
        System.out.println("Bii Bii!");
    }
}

class Carro extends Veiculo {
    String marca;
    
    void exibirMarca() {
        System.out.println("Marca: " + marca);
    }
}
```

---

## 5. Polimorfismo
O polimorfismo permite que metodos tenham comportamentos diferentes em classes derivadas.

```java
class Veiculo {
    void mover() {
        System.out.println("O veiculo esta se movendo");
    }
}

class Carro extends Veiculo {
    @Override
    void mover() {
        System.out.println("O carro esta rodando na estrada");
    }
}
```

---

## 6. Conclusao
Nesta aula, abordamos os conceitos fundamentais da POO e implementamos exemplos práticos em Java.

### Exercícios sugeridos:
1. Crie uma classe `Pessoa` com atributos `nome` e `idade` e métodos `falar()` e `andar()`.
2. Crie uma classe `Funcionario` que herde de `Pessoa` e adicione um atributo `salario`.
3. Modifique `Funcionario` para aplicar encapsulamento e criar métodos `getSalario()` e `setSalario()`.

---

### Proxima Aula
Na próxima aula, aprenderemos sobre **interfaces** e **classes abstratas**!
