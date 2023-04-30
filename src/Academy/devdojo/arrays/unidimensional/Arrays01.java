package Academy.devdojo.arrays.unidimensional;

public class Arrays01 {
    public static void main(String[] args) {
       double nota1  = 6;
       double nota2 = 2;
       double nota3 = 5;
       double nota4 = 6;
        System.out.println("Sua media é " + (nota1 + nota2 + nota3 + nota4) / 2 );
        double[] notas = new double[4];
        System.out.println("---------------------------");
        notas[0]= 6;
        notas[1]= 2;
        notas[2]= 5;
        notas[3]= 6;
        System.out.println("Tamanho do array; "+notas.length);
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);

        }

    }
}
