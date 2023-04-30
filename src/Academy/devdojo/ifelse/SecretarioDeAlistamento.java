package Academy.devdojo.ifelse;

import java.util.Scanner;

public class SecretarioDeAlistamento {
    public static void main(String[] args) {
        char sexo ='f';
        int idade = 18;
        if( (sexo =='m'|| sexo =='f' && idade < 18)) {
            System.out.println("alistamento nao permitido");
        }else if(sexo == 'm' && idade >=18) {
            System.out.println("Alistamento Obrigatorio");
        }else if(sexo == 'f' && idade>= 18) {
            System.out.println("deseja se alistar?");
        }


    }
}


