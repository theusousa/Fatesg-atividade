// Atividade8.java
import java.util.Scanner;

public class atividade8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] < 0) {
                numeros[i] = 0;
            }
        }

        System.out.println("Vetor final:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}