package Academy.devdojo.arrays.unidimensional;

import java.sql.SQLOutput;
import java.util.Scanner;

public class arraysexercicios03 {
    public static void main(String[] args) {
int[] array1 = new int[3];
int[] array2 = new int[3];
int[] array3 = new int[3];
Scanner scanner = new Scanner(System.in);
String resultadoMultiplicaçaoArrays = "";
for (int i = 0; i < array1.length; i++) {
    System.out.println("Vetor 1, Posição " + i + ";");
    array1[i] =scanner.nextInt();
    System.out.println("Vetor 2, posiçao " + i + ":");
    array2[i] = scanner.nextInt();
    array3[i] = array1[i] * array2 [i];
   resultadoMultiplicaçaoArrays = resultadoMultiplicaçaoArrays + array3[i] + " ";
   }
        System.out.println(resultadoMultiplicaçaoArrays);
            
        }

        }
    

