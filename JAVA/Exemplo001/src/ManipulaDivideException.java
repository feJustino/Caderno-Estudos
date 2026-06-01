import java.util.Scanner;

public class ManipulaDivideException{

    public static void main(String[]args){

        Scanner inputDevice=new Scanner(System.in);

        System.out.print("Digite o primeiro número (numerador): ");

        int numerador=inputDevice.nextInt();

        System.out.print("Digite o segundo número (denominador):");

        int denominador=inputDevice.nextInt();

        new ManipulaDivideException().fazerDivisao(numerador,denominador);

    }

    public void fazerDivisao(int a,int b){

        try{

            float resultado= a/b;

            System.out.println("Resultado da divisão de "+ a +"/" +b +"= "+resultado);

        }catch(ArithmeticException e){

            System.out.println("O Programa de Condição de Exceção está terminando");

        }

    }

}

