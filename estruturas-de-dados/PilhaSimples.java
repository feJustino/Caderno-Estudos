public class PilhaSimples {
  static int topo = -1;
  static int tam = 3;
  static int vetor[] = new int[tam];

  public static void main(String[] args) {
    simularPilha();
  }

  public static boolean PilhaCheia() {
    if (topo >= tam - 1) {
      return true;
    }
    return false;
  }

  public static boolean PilhaVazia() {
    if (topo == -1) {
      return true;
    }
    return false;
  }

  public static void Empilhar(int valor) {
    if (PilhaCheia()) {
      System.out.println("Pilha cheia!");
      return;
    }

    topo++;
    vetor[topo] = valor;
  }

  public static int Desempilhar() {
    if (PilhaVazia()) {
      System.out.println("Pilha vazia!");
      return -1;
    }
    int topoAtual = vetor[topo];
    topo--;
    return topoAtual;
  }

  public static int ElementoTopo() {
    if (PilhaVazia()) {
      System.out.println("Pilha vazia!");
      return -1;
    }
    return vetor[topo];
  }

  public static void simularPilha() {
    Empilhar(5);
    Empilhar(8);
    Empilhar(4);
    Empilhar(7);

    Desempilhar();
    Desempilhar();

    System.out.println(ElementoTopo());

    Desempilhar();
    Desempilhar();
  }
}