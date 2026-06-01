# Classe String em Java

## 1. O que é a classe String?

Em Java, a classe `String` representa uma sequência de caracteres (cadeias de caracteres). Diferente de linguagens como C, onde strings são vetores de caracteres, em Java strings são **objetos** que possuem uma série de métodos utilitários para facilitar a manipulação de texto.

A característica mais importante da classe `String` é que ela é **imutável**. Isso significa que, uma vez criado um objeto `String`, seu conteúdo nunca pode ser alterado. Qualquer operação que pareça modificar a string (como `concat`, `replace`, `toUpperCase`, etc.) na realidade cria um **novo objeto** `String`, deixando o original intacto.

Essa imutabilidade traz vantagens de segurança, desempenho em ambientes _multithread_ e uso eficiente de memória através de um mecanismo chamado **String Constant Pool**.

## 2. Criando objetos String

Existem duas formas principais de criar uma `String`:

```java
// Forma 1: usando o operador new (cria um objeto no heap)
String nome1 = new String("Abel");

// Forma 2: usando literal (recomendado)
String nome2 = "Abel";
```

### 2.1 Literal x `new` – O que muda?

Quando você usa um **literal** (`"Abel"`), a JVM verifica se já existe uma string com o mesmo valor no **String Constant Pool** (uma área especial da memória _heap_). Se existir, a variável apenas referencia a string já existente. Caso contrário, uma nova string é criada no pool.

Quando você usa `new String("Abel")`, a JVM **sempre** cria um novo objeto no heap, mesmo que exista uma string igual no pool.

```java
String s1 = "Abel";
String s2 = "Abel";
String s3 = new String("Abel");

System.out.println(s1 == s2); // true – ambas apontam para o mesmo objeto no pool
System.out.println(s1 == s3); // false – s3 é um objeto diferente no heap
```

### 2.2 Atribuição e imutabilidade na prática

Veja este exemplo passo a passo:

```java
String nome = "Abel";   // (1) nome aponta para "Abel"
String s2 = nome;       // (2) s2 aponta para o mesmo objeto "Abel"

nome = nome.concat(" Cardoso"); // (3) cria NOVO objeto "Abel Cardoso"
```

**Explicação gráfica**:

- Após (1) e (2): duas variáveis (`nome` e `s2`) apontam para o mesmo objeto `"Abel"`.
- Após (3): `nome` passa a apontar para o novo objeto `"Abel Cardoso"`, mas `s2` continua apontando para o `"Abel"` original. O objeto `"Abel"` não foi modificado – ele continua intacto na memória.

## 3. Comparação de strings

### 3.1 Comparando referências – operador `==`

O operador `==` compara se duas variáveis apontam para o **mesmo objeto** na memória (comparação rasa).

```java
String literal1 = "Java";
String literal2 = "Java";
String objeto1 = new String("Java");
String objeto2 = new String("Java");

System.out.println(literal1 == literal2); // true (mesmo objeto no pool)
System.out.println(literal1 == objeto1);  // false (objetos diferentes)
System.out.println(objeto1 == objeto2);   // false (objetos diferentes)
```

### 3.2 Comparando valores – método `equals()`

Para comparar o **conteúdo** (sequência de caracteres) de duas strings, use o método `equals()`.

```java
String s1 = "Java";
String s2 = new String("Java");

System.out.println(s1.equals(s2)); // true – o conteúdo é igual
System.out.println(s1 == s2);      // false – objetos diferentes
```

### 3.3 Ignorando maiúsculas/minúsculas – `equalsIgnoreCase()`

```java
String x = "Sair";
System.out.println(x.equalsIgnoreCase("SAIR")); // true
System.out.println(x.equalsIgnoreCase("tixe")); // false
```

## 4. Métodos essenciais da classe String

A classe `String` possui dezenas de métodos úteis. Abaixo os mais importantes:

| Método                          | Descrição                                                      | Exemplo                                            |
| ------------------------------- | -------------------------------------------------------------- | -------------------------------------------------- |
| `charAt(int index)`             | Retorna o caractere na posição `index` (base 0)                | `"avião".charAt(2)` → `'i'`                        |
| `concat(String s)`              | Concatena a string `s` ao final                                | `"autor".concat(" do livro")` → `"autor do livro"` |
| `length()`                      | Retorna o número de caracteres                                 | `"01234567".length()` → `8`                        |
| `replace(char old, char new)`   | Substitui todas as ocorrências de `old` por `new`              | `"oxox".replace('x','X')` → `"oXoX"`               |
| `substring(int begin)`          | Retorna a substring do índice `begin` até o fim                | `"012345".substring(3)` → `"345"`                  |
| `substring(int begin, int end)` | Retorna substring de `begin` (inclusive) até `end` (exclusive) | `"012345".substring(2,5)` → `"234"`                |
| `toLowerCase()`                 | Converte todos os caracteres para minúsculo                    | `"Java".toLowerCase()` → `"java"`                  |
| `toUpperCase()`                 | Converte todos os caracteres para maiúsculo                    | `"Java".toUpperCase()` → `"JAVA"`                  |
| `trim()`                        | Remove espaços em branco do início e fim                       | `" oi ".trim()` → `"oi"`                           |
| `toCharArray()`                 | Converte a string em um array de `char`                        | `"Java".toCharArray()` → `{'J','a','v','a'}`       |
| `contains(CharSequence s)`      | Verifica se a string contém a sequência                        | `"Java é bom".contains("Java")` → `true`           |

### Exemplos práticos

```java
String x = "0123456789";
System.out.println(x.substring(5));      // "56789"
System.out.println(x.substring(5, 8));   // "567" (índice 8 exclusivo)

String y = "  Olá Mundo!  ";
System.out.println(y.trim());            // "Olá Mundo!"

String z = "Um novo livro Java";
System.out.println(z.toUpperCase());     // "UM NOVO LIVRO JAVA"
```

## 5. Por que precisamos de StringBuffer e StringBuilder?

Como a `String` é imutável, operações que envolvem muitas modificações (como concatenar milhares de vezes dentro de um loop) geram um número excessivo de objetos temporários, causando desperdício de memória e queda de desempenho.

### 5.1 StringBuffer

- **Mutável** – permite modificar o conteúdo sem criar novos objetos.
- **Sincronizado** – todos os seus métodos principais são `synchronized`, portanto é **thread-safe** (pode ser usado com segurança em múltiplas threads).
- Como consequência da sincronização, é um pouco mais lento em ambientes de _thread única_.

### 5.2 StringBuilder

- **Mutável** também, com os mesmos métodos do `StringBuffer`.
- **Não sincronizado** – não é thread-safe, mas em contrapartida é **mais rápido** em cenários de _thread única_.
- **Recomendado** para a maioria dos casos práticos, a menos que você esteja compartilhando o objeto entre várias threads.

## 6. Métodos comuns de StringBuffer e StringBuilder

Ambas as classes oferecem um conjunto similar de métodos para manipulação eficiente de strings mutáveis.

| Método                                  | Descrição                                         | Exemplo                   |
| --------------------------------------- | ------------------------------------------------- | ------------------------- |
| `append(String s)`                      | Adiciona a string ao final                        | `sb.append("ABC")`        |
| `insert(int offset, String s)`          | Insere a string na posição `offset`               | `sb.insert(2, "XYZ")`     |
| `delete(int start, int end)`            | Remove caracteres de `start` até `end-1`          | `sb.delete(4, 8)`         |
| `replace(int start, int end, String s)` | Substitui o trecho pela string `s`                | `sb.replace(1, 3, "XYZ")` |
| `reverse()`                             | Inverte a sequência de caracteres                 | `sb.reverse()`            |
| `setCharAt(int index, char ch)`         | Substitui o caractere na posição `index` por `ch` | `sb.setCharAt(3, 'x')`    |

### Exemplos com StringBuilder

```java
StringBuilder sb = new StringBuilder("ABCDEF");

// Replace
sb.replace(1, 3, "XYZ");
System.out.println(sb); // AXYZDEF

// Reverse
sb.reverse();
System.out.println(sb); // FEDZYXA

// Insert
sb.insert(2, "123");
System.out.println(sb); // FE123DZYXA

// Delete
sb.delete(2, 5);
System.out.println(sb); // FEDZYXA

// setCharAt
sb.setCharAt(0, 'W');
System.out.println(sb); // WEDZYXA
```

## 7. Comparação de desempenho: String vs StringBuffer

O programa a seguir demonstra a enorme diferença de desempenho ao realizar 10.000 concatenações usando `String` (imutável) e `StringBuffer` (mutável).

```java
import java.util.Date;
import java.sql.Timestamp;

public class StringComparePerformance {
    public static void main(String[] args) {
        // Teste com StringBuffer
        Date sData = new Date();
        long sTempo = sData.getTime();
        System.out.println("Início StringBuffer: " + new Timestamp(sTempo));

        StringBuffer sb = new StringBuffer("AA");
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }

        Date eData = new Date();
        long eTempo = eData.getTime();
        System.out.println("Fim StringBuffer: " + new Timestamp(eTempo));
        System.out.println("Tempo gasto (StringBuffer): " + (eTempo - sTempo) + " ms");

        System.out.println("=========================================================");

        // Teste com String (imutável)
        Date strData = new Date();
        long strTime = strData.getTime();
        System.out.println("Início String: " + new Timestamp(strTime));

        String str = new String("AA");
        for (int i = 0; i < 10000; i++) {
            str += i;   // Cria um novo objeto String a cada iteração!
        }

        Date eStrDate = new Date();
        long eStrTime = eStrDate.getTime();
        System.out.println("Fim String: " + new Timestamp(eStrTime));
        System.out.println("Tempo gasto (String): " + (eStrTime - strTime) + " ms");
    }
}
```

**Resultado típico**: O loop com `String` pode ser **centenas de vezes mais lento** do que com `StringBuffer`/`StringBuilder`, devido à criação excessiva de objetos temporários.

## 8. Quando usar cada um?

| Cenário                                                                               | Classe recomendada | Motivo                                               |
| ------------------------------------------------------------------------------------- | ------------------ | ---------------------------------------------------- |
| String não sofre alterações, ou poucas concatenações                                  | `String`           | Imutabilidade traz segurança e uso do pool constante |
| Muitas modificações em ambiente _single-thread_                                       | `StringBuilder`    | Melhor desempenho, sem overhead de sincronização     |
| Muitas modificações em ambiente _multithread_ (várias threads acessam o mesmo objeto) | `StringBuffer`     | Thread-safe graças à sincronização                   |

> 💡 **Dica**: Na maioria dos programas comuns (aplicações desktop, web em um único request, loops de concatenação), o `StringBuilder` é a melhor escolha por ser mais rápido.

## 9. Resumo visual

```
String  → imutável, pool constante, ideal para valores fixos
            ↓
            Se muitas alterações forem necessárias
            ↓
    StringBuilder  → mutável, rápido, não thread-safe
    StringBuffer    → mutável, mais lento, thread-safe
```

## 10. Atividades complementares

1. **Artigo recomendado**: _Strings no Java – Não Use o Operador de Igualdade!_ – explica por que o operador `==` não deve ser usado para comparar conteúdo de strings.
2. **Ferramenta útil**: _Java Online Compiler_ – permita testar pequenos trechos de código com strings rapidamente.

## Referências bibliográficas

- BARNES, D. J.; KOLLING, M. _Programação orientada a objetos com Java: uma introdução prática usando o BlueJ_. 4. ed. Pearson, 2009.
- FELIX, R. (Org.). _Programação orientada a objetos_. Pearson, 2017.
- MEDEIROS, L. F. de. _Banco de dados: princípios e prática_. Intersaberes, 2013.
- ORACLE. _Java Documentation_. Disponível em: <https://docs.oracle.com/en/java/>. Acesso em: 2025.
