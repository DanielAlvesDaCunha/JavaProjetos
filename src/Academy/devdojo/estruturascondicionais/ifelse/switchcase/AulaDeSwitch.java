package Academy.devdojo.estruturascondicionais.ifelse.switchcase;

public class AulaDeSwitch {
    public static void main(String[] args) {
        int dia = 5;
        switch (dia) {
            case 1:
                System.out.println("segunda");
                break;
            case 2:
                System.out.println("terça");
                break;
            case 3:
                System.out.println("quarta");
                break;
            case 4 :
                System.out.println("quinta");
                break;
            case 5 :
                System.out.println("sexta");
                break;
            case 6 :
                System.out.println("sabado");
                break;
            case 7 :
                System.out.println("domingo");
                break;
            default:
                System.out.println("Invalid Day");
                break;

        }
    }
}
