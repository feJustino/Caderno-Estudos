import java.util.Scanner;

public class DivideExceptionThrows{

    public static void main(String[]args){

        Scanner inputDevice=new Scanner(System.in);

        System.out.print("Digite o primeiro número (numerador): (numerador): ");

        int numerador=inputDevice.nextInt();

        System.out.print("Digite o segundo número (numerador): (denominador): ");

        int denominador=inputDevice.nextInt();

        try{

            new DivideExceptionThrows().fazerDivisao(numerador,denominador);

        }catch(Exception e){

            System.out.println("O Programa de Condição de Exceção está terminando ");

        }

    }

    public void fazerDivisao(int a,int b) throws Exception{

        float resultado= a/b;

        System.out.println("Resultado da divisão de "+ a +"/”+b +”= "+resultado);

    }

}