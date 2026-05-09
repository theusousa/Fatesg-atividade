// Atividade6.java
import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite A[" + i + "]: ");
            vetorA[i] = sc.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Digite B[" + i + "]: ");
            vetorB[i] = sc.nextInt();
        }

        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("Vetor C:");

        for (int i = 0; i < vetorC.length; i++) {
            System.out.println("C[" + i + "] = " + vetorC[i]);
        }

        sc.close();
    }
}