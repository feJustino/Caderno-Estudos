public class MergeSort {

  // Método principal que divide o vetor recursivamente ao meio
  public static void mergeSort(int inicio, int fim, int vetor[]) {
    if (inicio < fim) {
      // Calcula o índice do meio do subvetor
      int meio = (inicio + fim) / 2;

      // Ordena a metade esquerda
      mergeSort(inicio, meio, vetor);
      
      // Ordena a metade direita
      mergeSort(meio + 1, fim, vetor);
      
      // Mescla as duas metades já ordenadas
      merge(inicio, meio, fim, vetor);
    }
  }

  // Método responsável por intercalar/mesclar dois subvetores ordenados
  public static void merge(int inicio, int meio, int fim, int vetor[]) {
    int tamanho = fim - inicio + 1; // Tamanho do subvetor a ser mesclado
    int[] aux = new int[tamanho]; // Vetor auxiliar para armazenar os elementos ordenados temporariamente
    
    int indiceEsquerda = inicio;   // Ponteiro para a metade esquerda
    int indiceDireita = meio + 1; // Ponteiro para a metade direita
    int indiceAux = 0;             // Ponteiro para o vetor auxiliar

    // Compara os elementos das duas metades e coloca o menor no vetor auxiliar
    while (indiceEsquerda <= meio && indiceDireita <= fim) {
      if (vetor[indiceEsquerda] <= vetor[indiceDireita]) {
        aux[indiceAux] = vetor[indiceEsquerda];
        indiceEsquerda++;
      } else {
        aux[indiceAux] = vetor[indiceDireita];
        indiceDireita++;
      }
      indiceAux++;
    }

    // Copia os elementos restantes da metade esquerda, se houver
    while (indiceEsquerda <= meio) {
      aux[indiceAux] = vetor[indiceEsquerda];
      indiceEsquerda++;
      indiceAux++;
    }

    // Copia os elementos restantes da metade direita, se houver
    while (indiceDireita <= fim) {
      aux[indiceAux] = vetor[indiceDireita];
      indiceDireita++;
      indiceAux++;
    }

    // Copia os elementos ordenados do vetor auxiliar de volta para o vetor original
    for (int k = 0; k < tamanho; k++) {
      vetor[inicio + k] = aux[k];
    }
  }

  public static void main(String[] args) {
    int numeros[] = { 5, 3, 8, 4, 2 };
    mergeSort(0, numeros.length - 1, numeros);

    System.out.print("Números ordenados: ");
    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i] + " ");
    }
  }
}