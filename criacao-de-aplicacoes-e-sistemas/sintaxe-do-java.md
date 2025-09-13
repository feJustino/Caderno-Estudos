# Sintaxe do Java

## 1. Introdução

Java é uma linguagem de programação orientada a objetos, tipada estaticamente e case sensitive. Sua sintaxe é inspirada em C/C++, mas com recursos modernos que favorecem a segurança, a clareza e a portabilidade.

---

## 2. Principais Características da Sintaxe

* **Blocos de Código**: delimitados por `{ }`.
* **Controle de Fluxo**: `if`, `else`, `for`, `while`, `do-while`, `switch`.
* **Tratamento de Exceções**: `try`, `catch`, `finally`, `throw`.
* **Comentários**:

  * Linha única: `// comentário`
  * Múltiplas linhas: `/* comentário */`
  * Documentação: `/** comentário Javadoc */`
* **Case Sensitive**: diferencia maiúsculas e minúsculas (`variavel` ≠ `Variavel`).
* **Tipagem Estática**: o tipo de cada variável é definido na compilação.
* **Estrutura de Programa**: composta por classes e métodos obrigatórios.
* **Classes e Métodos**: todo programa Java precisa ter pelo menos uma classe e o método `main`.

---

## 3. Estrutura Básica de um Programa

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

1. `public class HelloWorld`: declara a classe pública `HelloWorld`.
2. `public static void main(String[] args)`: método principal, ponto de entrada do programa.
3. `System.out.println("Hello, World!");`: imprime no console.

---

## 4. Tipos de Dados Primitivos

Java possui **8 tipos primitivos**, cada um com seu tamanho e finalidade:

| Tipo      | Tamanho | Intervalo/Valores                |
| --------- | ------- | -------------------------------- |
| `byte`    | 8 bits  | -128 a 127                       |
| `short`   | 16 bits | -32.768 a 32.767                 |
| `int`     | 32 bits | -2³¹ a 2³¹-1                     |
| `long`    | 64 bits | -2⁶³ a 2⁶³-1                     |
| `float`   | 32 bits | ponto flutuante precisão simples |
| `double`  | 64 bits | ponto flutuante precisão dupla   |
| `char`    | 16 bits | caractere Unicode                |
| `boolean` | 1 bit   | `true` ou `false`                |

### Exemplo:

```java
public class Tipos {
    public static void main(String[] args) {
        int idade = 25;
        double altura = 1.75;
        char inicial = 'A';
        boolean ativo = true;

        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Inicial: " + inicial);
        System.out.println("Ativo: " + ativo);
    }
}
```

---

## 5. Vetores (Arrays)

* **Declaração**:
  `int[] numeros;`
  `String[] nomes;`
* **Inicialização Estática**:
  `int[] numeros = {1, 2, 3, 4, 5};`
* **Inicialização Dinâmica**:
  `int[] numeros = new int[5];`

### Exemplo:

```java
int[] numeros = new int[5];
numeros[0] = 10;
numeros[1] = 20;
numeros[2] = 30;

System.out.println("Valores do vetor:");
for (int i = 0; i < numeros.length; i++) {
    System.out.println("Posição " + i + ": " + numeros[i]);
}

String[] nomes = {"Ana", "Bruno", "Carlos"};
for (String nome : nomes) {
    System.out.println(nome);
}
```

---

## 6. Matrizes (Arrays Multidimensionais)

Uma matriz é um vetor de vetores.

* **Declaração**:
  `int[][] matriz = new int[3][3];`
* **Inicialização com valores**:

  ```java
  int[][] matriz = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
  };
  ```

### Exemplo:

```java
System.out.println("Valores da matriz:");
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println();
}
```

---

## 7. Estruturas de Dados em Java

* **Arrays**: coleção fixa de elementos do mesmo tipo.
* **Listas**: `ArrayList`, `LinkedList`.
* **Pilhas (Stacks)**: LIFO.
* **Filas (Queues)**: FIFO.
* **Conjuntos (Sets)**: `HashSet`, `TreeSet`.
* **Mapas (Maps)**: `HashMap`, `TreeMap`.

---

## 8. Conteúdo Extra

🎥 **Vídeo recomendado**: *Sintaxe Java | Curso de Java Completo | Aula 01* – Canal *Noturama Fut* no YouTube.

---

## 9. Referências

* ASCENCIA, A. F. G.; CAMPOS, E. A. V. *Fundamentos da programação*. Pearson, 2007.
* DEITEL, H. M.; DEITEL, P. J.; CHOFFNES, D. R. *Sistemas operacionais*. Pearson, 2005.
* FORBELLONE, A. L. V.; EBERSPACHER, H. F. *Lógica de programação*. Pearson, 2005.
* GUEDES, S. (Org.). *Lógica de programação algorítmica*. Pearson, 2014.
* PUGA, S.; RISSETTI, G. *Lógica de programação e estruturas de dados, com aplicações em Java*. Pearson, 2016.
