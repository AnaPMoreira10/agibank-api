# agibank-api

Projeto de testes automatizados de API utilizando Cucumber, JUnit e Rest-Assured.

## Pré-requisitos

- Java 21 — [download](https://www.oracle.com/java/technologies/downloads/#java21)
- Maven 3.x — [download](https://maven.apache.org/download.cgi)

### Instalando o Maven no Windows

1. Baixe o arquivo `.zip` em https://maven.apache.org/download.cgi (ex: `apache-maven-3.x.x-bin.zip`)
2. Extraia em um diretório, ex: `C:\Program Files\Maven`
3. Adicione o Maven ao PATH:
   - Pesquise "Variáveis de Ambiente" no Windows
   - Em "Variáveis do sistema", edite `Path` e adicione `C:\Program Files\Maven\apache-maven-3.x.x\bin`
4. Abra um novo terminal e confirme com:
   ```powershell
   mvn -version
   ```

## Como rodar os testes

Clone o repositório e execute na raiz do projeto:

```bash
mvn test -Dtest=Runner
```

Os testes utilizam a tag `@agibank` definida no Runner. O relatório HTML é gerado automaticamente em `target/report.html` ao final da execução.

## Estrutura

- `src/main/java/logic/agibank.feature` — cenários Cucumber em português
- `src/main/java/logic/Steps.java` — implementação dos steps
- `src/main/java/logic/Runner.java` — configuração do runner JUnit/Cucumber
- `src/main/java/base/ApiClient.java` — cliente HTTP base
