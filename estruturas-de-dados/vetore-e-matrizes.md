- Vetore e Matrizes
  - Vetores e Matrizes são estruturas de dados Homogeneneas
  - Podemos realizar operações dentro de vetores e matrizes (decisão, repetição, etc)
  - Vetor é uma matriz unidimensional
  - Matriz possui linhas e coluna
  - Vetor pega um espaço contiguo de memória
  - Atribuimos valores ao indices do vetor e da matriz
  - Matriz linha por coluna - matriz [linha][coluna]
  - Depdende do problema a ser solucionado
  - Loop para matrizes são encadeados (loop dentro de loop)
    - para mais externos percorre as linhas
    - para mais internos percorre as colunas

```java
class Somar {
  public static void main (String args[]) {
    int VetSoma[], i, soma = 0;
    VetSoma new int[100];

    for (i=0; i<=99; i++) {
      VetSoma[i] = Integer.parseInt(JOptionPane.showInputDialog(
        "Digite um valor inteiro"
      ));
      soma = soma + VetSoma[i];
    }
    System.out.println("A Soma dos 100 valores é: " + soma);
  }
  System.exit(0)
}

```

```java
class Somar {
  public static void main (String args[]) {
    int MatSoma[][], i, j, soma = 0;
    MatSoma new int[10][12];
    for (i=0; i<=9; i++) {
      for (j=0; j<=11; j++) {
        MatSoma[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
          "Digite um valor inteiro"
        ));
        soma = soma + MatSoma[i][j];
      }
    }
    System.out.println("A Soma dos 100 valores é: " + soma);
  }
  System.exit(0)
}

```
