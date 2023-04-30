package Academy.devdojo.laçosDeRepetiçao.whiles;

import java.util.Scanner;

public class MenuVisual {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i = 0;

        System.out.println("1.Calculate tax");
        System.out.println("2.Deposit salary");
        System.out.println("3.Exit");
        System.out.println("Select an option:");

        int menu = teclado.nextInt();
            switch(menu) {
                case 1:
                    System.out.println("Calculating tax...");
                    break;
                case 2:
                    System.out.println("Calculating salary");
                    break;
                case 3:
                    i =1;
                    break;
                default:
                    System.out.println("Invalid Option!");
            }
        }
    }

