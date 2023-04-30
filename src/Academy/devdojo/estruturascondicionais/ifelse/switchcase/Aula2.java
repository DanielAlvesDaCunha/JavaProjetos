package Academy.devdojo.estruturascondicionais.ifelse.switchcase;

import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {
       String conta = "CONTA INVESTIMENTO";
       switch(conta) {
           case "CONTA POUPANÇA":
               System.out.println("Voce tera um juros de 0.05%");
               break;
           case "CONTA CORRENTE":
               System.out.println("Voce tera um juros de 0.02%");
               break;
           case "CONTA INVESTIMENTO":
                   System.out.println("Voce tera um juros de 0.1%");
                   break;
           default:
               System.out.println("CONTA INEXISTENTE");

       }

    }
}
