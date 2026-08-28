import javax.swing.*;

/* Recursão com cauda - Função recursiva */
class FatorialC {
  static int fatc(int n) {
    int f;
    if (n == 0) {
      return 1;
    } else {
      f = n * fatc(n - 1);
      return f;
    }
  }

  public static void main(String arg[]) {
    int nro;
    nro = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor que você deseja:"));
    if (nro < 0) {
      System.out.println("ERRO");
      System.exit(0);

    } else {
      System.out.println("Fatorial de " + nro + " é igual a " + fatc(nro));
    }
    System.exit(0);
  }
}