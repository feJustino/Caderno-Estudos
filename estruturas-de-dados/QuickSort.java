public class QuickSort {

  public static void quickSort(int inicio, int fim, int vetor[]) {
    int indicePivo;
    if (inicio < fim) {
      indicePivo = particao(inicio, fim, vetor);
      quickSort(inicio, indicePivo - 1, vetor);
      quickSort(indicePivo + 1, fim, vetor);
    }
  }

  /* Retorna a posição final do pivô */
  public static int particao(int inicio, int fim, int vetor[]) {
    int menorElementoFim = inicio - 1;
    int temp, pivo = vetor[fim];

    for (int i = inicio; i <= fim; i++) {
      if (vetor[i] <= pivo) {
        menorElementoFim++;
        temp = vetor[menorElementoFim];
        vetor[i] = vetor[menorElementoFim];
        vetor[menorElementoFim] = temp;
      }
    }
    return menorElementoFim;
  }

  public static void main(String[] args) {
    int numeros[] = { 5, 3, 8, 4, 2 };
    quickSort(0, numeros.length - 1, numeros);

    System.out.print("Números ordenados: ");
    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i] + " ");
    }
  }
}