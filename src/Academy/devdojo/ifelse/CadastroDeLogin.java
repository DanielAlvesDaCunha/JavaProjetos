package Academy.devdojo.ifelse;

import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Crie um login:");
        String nome = input.next();
        if (nome.equals("") || nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")){
                System.out.println("usuario invalido");
        } else {
            System.out.println(nome + " Cadastrado com sucesso");


        }
    }
}
