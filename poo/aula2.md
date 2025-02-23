# Aula de Programacao Orientada a Objetos (POO) em Java

## Objetivos da Aula
- Compreender o conceito de interfaces e classes abstratas
- Implementar interfaces e classes abstratas em Java
- Entender a diferença e aplicabilidade de cada recurso

---

## 1. Introducao a Interfaces e Classes Abstratas

### **Interfaces:**
- Definem um contrato que as classes devem cumprir.
- Contêm apenas métodos abstratos (sem implementação) e constantes.
- Permitem a implementação múltipla (uma classe pode implementar várias interfaces).

### **Classes Abstratas:**
- Podem conter métodos abstratos (sem implementação) e métodos concretos (com implementação).
- Não podem ser instanciadas diretamente.
- Permitem herança única (uma classe pode herdar apenas uma classe abstrata).

---

## 2. Implementando uma Interface
Vamos criar uma interface chamada `Animal` e uma classe `Cachorro` que a implementa.

```java
interface Animal {
    void emitirSom();
}

class Cachorro implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro late: Au Au!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal meuCachorro = new Cachorro();
        meuCachorro.emitirSom();
    }
}
```

---

## 3. Implementando uma Classe Abstrata
Agora, vamos criar uma classe abstrata `Forma` e uma classe `Circulo` que herda dela.

```java
abstract class Forma {
    abstract double calcularArea();
    
    void exibirTipo() {
        System.out.println("Esta é uma forma geométrica.");
    }
}

class Circulo extends Forma {
    private double raio;
    
    public Circulo(double raio) {
        this.raio = raio;
    }
    
    @Override
    double calcularArea() {
        return Math.PI * raio * raio;
    }
}

public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(5);
        c.exibirTipo();
        System.out.println("Área do círculo: " + c.calcularArea());
    }
}
```

---

## 4. Diferenças entre Interfaces e Classes Abstratas
| Característica               | Interface                       | Classe Abstrata                |
|-----------------------------|---------------------------------|--------------------------------|
| Implementação de Métodos    | Não (antes do Java 8)           | Sim                            |
| Herança                     | Múltiplas interfaces             | Apenas uma classe abstrata     |
| Uso de Modificadores        | Somente `public`                | Pode usar `public`, `protected`, `private` |
| Quando usar?                | Para definir contratos          | Para fornecer uma base parcial para subclasses |

---

## 5. Conclusao
Nesta aula, exploramos as interfaces e classes abstratas, entendendo como e quando utilizá-las.

### Exercícios sugeridos:
1. Crie uma interface `Veiculo` com o método `mover()` e implemente-a nas classes `Carro` e `Bicicleta`.
2. Crie uma classe abstrata `Funcionario` com o método abstrato `calcularSalario()` e implemente-a nas classes `Gerente` e `Vendedor`.

---

### Proxima Aula
