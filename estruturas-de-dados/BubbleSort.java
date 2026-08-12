class BubbleSort
{
  public static int[] Bolha (int numeros[]){
    final int n = numeros.length;
    int aux;

    for (int i = 0; i < n - 1; i++)
    {
      for (int j = 0; j < n - 1 - i; j++)
      {
        if (numeros[j] > numeros[j + 1])
        {
          aux = numeros[j];
          numeros[j] = numeros[j + 1];
          numeros[j + 1] = aux;
        }
      }
    }
    return numeros;
  }

  public static void main(String[] args)
  {
    int numeros[] = { 5, 3, 8, 4, 2 };
    int numerosOrdenados[] = Bolha(numeros);

    System.out.print("Números ordenados: ");
    for (int i = 0; i < numerosOrdenados.length; i++)
    {
      System.out.print(numerosOrdenados[i] + " ");
    }
  }
}