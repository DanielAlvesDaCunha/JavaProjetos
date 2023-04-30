package Academy.devdojo.laçosDeRepetiçao.whiles;

import java.util.Scanner;

public class MenuVisual2 {
    public static void main(String[] args) {
        int option = 0;
        Scanner teclado = new Scanner(System.in);
        while(option != 1) {
            System.out.println("1. Calculating tax");
            System.out.println("2. Deposit salary");
            System.out.println("3.Exit");
            System.out.println("Select your option:");
            option = teclado.nextInt();
        }
        System.out.println("Closed Program");
    }
}
