# Sistema de Gerenciamento de Estoque

## Objetivo
Desenvolver um sistema web simples para gerenciar produtos em estoque, controlando entradas e saídas e gerando relatórios. O sistema será desenvolvido em **Java Web** utilizando **Servlets**, com o HTML gerado diretamente no código Java, sem o uso de JSP.

---

## Funcionalidades
1. **Listagem de Produtos:** Exibir todos os produtos cadastrados no sistema.
2. **Cadastro de Produtos:** Permitir o cadastro de novos produtos no estoque.
3. **Controle de Estoque:** Registrar entradas e saídas de produtos.
4. **Relatórios:** Gerar relatórios de movimentação e situação do estoque.
5. **Interface Simples:** Todo o HTML será gerado via código Java nos Servlets.

---

## Tecnologias Utilizadas
- **Java Servlet:** Para criação das rotas e renderização do HTML.
- **Apache Tomcat:** Servidor de aplicação para executar o projeto.
- **Banco de Dados:** H2 (embarcado) para facilitar o desenvolvimento e testes.
- **HTML e CSS:** O HTML será gerado via PrintWriter no Servlet.

---

## Estrutura do Projeto

```
SistemaDeGerenciamentoDeEstoque/
├── src/
│   ├── model/
│   │    └── Produto.java
│   ├── servlet/
│   │    ├── EstoqueServlet.java
│   │    ├── ProdutoServlet.java
│   │    └── MovimentacaoServlet.java
│   └── dao/
│        └── ProdutoDAO.java
├── webapp/
│    ├── WEB-INF/
│    │     └── web.xml
│    └── assets/
│           ├── css/
│           └── js/
└── pom.xml
```

---

## Implementações

### 1. Classe Produto (`model/Produto.java`)
```java
public class Produto {
    private int id;
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(int id, String nome, int quantidade, double preco) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public int getQuantidade() { return quantidade; }
    public double getPreco() { return preco; }

    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
}
```

---

### 2. ProdutoDAO (`dao/ProdutoDAO.java`)
```java
import java.util.*;
import model.Produto;

public class ProdutoDAO {
    private static final List<Produto> produtos = new ArrayList<>();

    public List<Produto> listar() {
        return produtos;
    }

    public void adicionar(Produto produto) {
        produtos.add(produto);
    }

    public Produto buscarPorId(int id) {
        return produtos.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }
}
```

---

### 3. ProdutoServlet (`servlet/ProdutoServlet.java`)
```java
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.ProdutoDAO;
import model.Produto;

@WebServlet("/produtos")
public class ProdutoServlet extends HttpServlet {
    private ProdutoDAO produtoDAO = new ProdutoDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Lista de Produtos</h1>");
        for (Produto produto : produtoDAO.listar()) {
            out.println("<p>" + produto.getNome() + " - Quantidade: " + produto.getQuantidade() + "</p>");
        }
        out.println("<a href='/cadastrar'>Cadastrar Produto</a>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        int quantidade = Integer.parseInt(request.getParameter("quantidade"));
        double preco = Double.parseDouble(request.getParameter("preco"));
        Produto produto = new Produto(produtoDAO.listar().size() + 1, nome, quantidade, preco);
        produtoDAO.adicionar(produto);
        response.sendRedirect("/produtos");
    }
}
```

---

## Próximos Passos
1. Testar o **ProdutoServlet** e validar o fluxo de cadastro e listagem.
2. Desenvolver o **MovimentacaoServlet** para gerenciar entradas e saídas do estoque.
3. Implementar os relatórios de movimentação e situação do estoque.

Caso tenha alguma dúvida ou queira avançar em outra parte específica, me avise!