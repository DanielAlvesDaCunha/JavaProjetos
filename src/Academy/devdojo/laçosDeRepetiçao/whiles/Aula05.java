package Academy.devdojo.laçosDeRepetiçao.whiles;

import java.util.Scanner;

public class Aula05 {
    public static void main(String[] args) {
        int desejaContinuar = 1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1.Digite um numero de 1 a 10");
            int num1= scanner.nextInt();
            System.out.println("2.Digite um numero de 1 a 10");
            int num2 = scanner.nextInt();
            System.out.println("Acerto " + (num1 == num2));
            System.out.println("=============================================");
            System.out.println("Deseja continuar jogando?");
            System.out.println("1.Sim");
            System.out.println("2.Não");
            desejaContinuar = scanner.nextInt();
        }while(desejaContinuar == 1);
    }
}
