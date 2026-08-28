import javax.swing.*;

/* Recursão sem cauda - Procedimento Recursivo */
class FatorialP {
  static void fatp(int n, int x, int f) {
    if (x == 0 || x == 1) {
      System.out.println("O fatorial de " + n + " é igual a " + f);
    } else {
      fatp(n, x - 1, f * x);
    }
  }

  public static void main(String arg[]) {
    int nro = 5;
    nro = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor que você deseja:"));
    if (nro < 0) {
      System.out.println("ERRO");
    } else {
      fatp(nro, nro, 1);
    }
    System.exit(0);
  }
}