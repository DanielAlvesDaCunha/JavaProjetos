package Academy.devdojo.arrays.unidimensional;

public class ArraysVetoresMultiplicação {
    public static void main(String[] args) {
        int[] vetor1 = new int[9];
        vetor1[0] = 0;
        vetor1[1] = 1;
        vetor1[2] = 2;
        vetor1[3] = 3;
        vetor1[4] = 4;
        vetor1[5] = 5;
        vetor1[6] = 6;
        vetor1[7] = 7;
        vetor1[8] = 8;
        int i = 0;
        for (i = 0; i < vetor1.length; i++) {
            System.out.println("Esses sao seus valores de v1: " + (i + 1));
        }
        int[] vetor2 = new int[9];
        vetor2[0] = 0;
        vetor2[1] = 1;
        vetor2[2] = 2;
        vetor2[3] = 3;
        vetor2[4] = 4;
        vetor2[5] = 5;
        vetor2[6] = 6;
        vetor2[7] = 7;
        vetor2[8] = 8;
        i = 0;
        for (i = 0; i < vetor2.length; i++) {
            System.out.println("Esses sao seus valores de v2: " + (i + 1));
        }
        System.out.printf("Multiplicação dos vetores de v1 e v2: "+ vetor1[3] * vetor2[3]);


    }

}

