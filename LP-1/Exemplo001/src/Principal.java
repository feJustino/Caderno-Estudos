import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args){
        int quantity;
        int total = 0;

        List<Integer> values = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Digite quantos valores deseja inserir:");

        quantity = input.nextInt();

        for (int i = 0; i < quantity; i++) {
            int value;
            System.out.println("Digite um valor:");
            value = input.nextInt();
            values.add(value);
        }

        Iterator<Integer> adder = values.iterator();

        while (adder.hasNext()){

            total += adder.next();
        }

        System.out.println("Valores processados: " + values);
        System.out.println("Soma dos valores igual a: " + total);


    }
}
