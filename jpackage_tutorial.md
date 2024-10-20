
# Gerando um Executável Java com jpackage

Este tutorial descreve como empacotar seu aplicativo Java como um executável nativo usando o `jpackage`, disponível no JDK 14 ou superior.

## Pré-requisitos:
1. **Java JDK 14 ou superior** instalado.
   - Verifique a versão do Java usando o comando:
     ```bash
     java --version
     ```

2. **Arquivo JAR** do seu programa Java.
   - Você deve ter seu programa Java empacotado em um arquivo `.jar`.

3. (Opcional) **Baixe uma JRE personalizada** se necessário, mas o `jpackage` gerará uma runtime automaticamente.

---

## Gerando um Executável no Windows

1. **Abra um terminal (cmd ou PowerShell)**.

2. Execute o seguinte comando:

   ```bash
   jpackage --input caminho_dos_arquivos --name NomeDoApp --main-jar NomeDoArquivo.jar --main-class NomeDoPacote.NomeDaClasse --type exe --icon caminho_do_icone.ico
   ```

   - `--input caminho_dos_arquivos`: Diretório com o arquivo JAR e dependências.
   - `--name NomeDoApp`: Nome do aplicativo.
   - `--main-jar NomeDoArquivo.jar`: Nome do arquivo JAR principal.
   - `--main-class NomeDoPacote.NomeDaClasse`: Nome da classe com o método `main`.
   - `--type exe`: Gera um `.exe` no Windows.
   - `--icon caminho_do_icone.ico`: Caminho do ícone do aplicativo (opcional).

   ### Exemplo completo:
   ```bash
   jpackage --input C:\meusprogramas --name ApresentacaoApp --main-jar Apresentacao.jar --main-class Apresentacao --type exe --icon C:\meusprogramas\icone.ico
   ```

3. **Executar o JAR**:
   - Após gerar o instalador `.exe`, ele estará na pasta de destino e poderá ser instalado como um programa comum no Windows.

---

## Gerando Executáveis no Linux ou macOS

Para criar pacotes para outros sistemas, altere o parâmetro `--type`. Exemplos:

### Linux (DEB ou RPM)
```bash
# Gerar um arquivo .deb
jpackage --input caminho_dos_arquivos --name NomeDoApp --main-jar NomeDoArquivo.jar --main-class NomeDoPacote.NomeDaClasse --type deb --icon caminho_do_icone.png
```

### macOS (PKG)
```bash
# Gerar um arquivo .pkg
jpackage --input caminho_dos_arquivos --name NomeDoApp --main-jar NomeDoArquivo.jar --main-class NomeDoPacote.NomeDaClasse --type pkg --icon caminho_do_icone.icns
```

---

## Configurações Opcionais:
- **`--dest`**: Especifica o diretório onde o instalador será salvo.
- **`--runtime-image`**: Define uma JRE personalizada a ser embutida no aplicativo.

### Exemplo com JRE personalizada:
```bash
jpackage --input C:\meusprogramas --name ApresentacaoApp --main-jar Apresentacao.jar --main-class Apresentacao --type exe --dest C:\instaladores --runtime-image C:\meusprogramas\jre
```

Agora, você pode distribuir o instalador gerado para outros usuários!
