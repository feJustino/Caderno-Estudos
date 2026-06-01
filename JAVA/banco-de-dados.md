# Banco de Dados

## Conceito de Banco de Dados

- Banco de dados é uma coleção organizada de dados, que pode ser facilmente acessada, gerenciada e atualizada. Ele é projetado para armazenar grandes volumes de informações de forma estruturada, permitindo que os usuários possam recuperar e manipular os dados de maneira eficiente.

## Relacional x Não Relacional

- **Banco de dados relacional**: Armazena os dados em tabelas, onde cada tabela representa uma entidade e as colunas representam os atributos dessa entidade. As tabelas podem ser relacionadas entre si por meio de chaves primárias e estrangeiras. Exemplos: MySQL, PostgreSQL, Oracle.
- **Banco de dados não relacional**: Armazena os dados de forma mais flexível, sem a necessidade de uma estrutura rígida de tabelas. Eles podem ser classificados em diferentes tipos, como bancos de dados de documentos, chave-valor, grafos, entre outros. Exemplos: MongoDB, Redis, Neo4j.

## JDBC

- JDBC (Java Database Connectivity) é uma API (Application Programming Interface) que permite que aplicações Java se conectem a bancos de dados relacionais. Ele fornece um conjunto de classes e interfaces para estabelecer conexões, executar consultas SQL e manipular os resultados. O JDBC é amplamente utilizado para desenvolver aplicações Java que precisam interagir com bancos de dados, como sistemas de gerenciamento de conteúdo, aplicativos web, entre outros.

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";

    try(Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
      if (conn != null) {
        System.out.println("Conexão estabelecida com sucesso!");
      } else {
        System.out.println("Falha ao estabelecer a conexão.");
      }
    } catch (SQLException e) {
        System.err.println("SQL State %s\n %s", e.getSQLState(), e.getMessage());
    } catch (Exception e) {
        e.printStackTrace();
    }
}
```

## Processo de leitura e escrita

- SQL (Structured Query Language) é a linguagem padrão para interagir com bancos de dados relacionais. Ela é usada para realizar operações de leitura e escrita, como inserir, atualizar, excluir e consultar dados. O SQL é uma linguagem declarativa, o que significa que os usuários descrevem o que desejam fazer com os dados, em vez de como fazê-lo.
-
- Statement é uma interface do JDBC que representa uma instrução SQL a ser executada. Ele é usado para enviar comandos SQL para o banco de dados e obter os resultados. Existem diferentes tipos de statements, como `Statement`, `PreparedStatement` e `CallableStatement`, cada um com suas próprias características e usos específicos.
  - PreparedStatement é uma subinterface de `Statement` que permite a criação de instruções SQL pré-compiladas. Ele é usado para executar consultas SQL com parâmetros, o que pode melhorar o desempenho e a segurança da aplicação. O `PreparedStatement` é especialmente útil para evitar ataques de injeção de SQL, pois os parâmetros são tratados como dados e não como parte da consulta SQL.

- Class.forName é um método da classe `Class` em Java que é usado para carregar dinamicamente uma classe em tempo de execução. Ele é comumente utilizado para carregar o driver JDBC necessário para estabelecer uma conexão com um banco de dados. Ao chamar `Class.forName("com.mysql.cj.jdbc.Driver")`, por exemplo, o driver do MySQL é carregado e registrado na JVM, permitindo que a aplicação Java se conecte ao banco de dados MySQL usando JDBC.

- DriverManager é uma classe do JDBC que gerencia os drivers de banco de dados e estabelece conexões com eles. Ele fornece métodos para registrar drivers, obter conexões e gerenciar o pool de conexões. O `DriverManager` é responsável por localizar o driver apropriado para a URL de conexão fornecida e estabelecer a conexão com o banco de dados.

- ResultSet é uma interface do JDBC que representa o resultado de uma consulta SQL. Ele é usado para armazenar e manipular os dados retornados por uma consulta SELECT. O `ResultSet` fornece métodos para navegar pelos resultados, acessar os valores das colunas e realizar operações de leitura nos dados retornados pelo banco de dados.

## Escrita de dados no Banco

- INSERT INTO é uma instrução SQL usada para inserir novos registros em uma tabela de banco de dados. Ela permite que os usuários adicionem dados a uma tabela especificando os valores para cada coluna. A sintaxe básica do `INSERT INTO` é a seguinte:

```sql
INSERT INTO nome_da_tabela (coluna1, coluna2, coluna3, ...)
VALUES (valor1, valor2, valor3, ...);
```

- UPDATE é uma instrução SQL usada para modificar os registros existentes em uma tabela de banco de dados. Ela permite que os usuários atualizem os valores de uma ou mais colunas para um ou mais registros específicos. A sintaxe básica do `UPDATE` é a seguinte:

```sql
UPDATE nome_da_tabela
SET coluna1 = valor1, coluna2 = valor2, ...
WHERE condição;
```
