// Atividade9.java
import java.util.Scanner;

public class atividade9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite A[" + i + "]: ");
            vetorA[i] = sc.nextInt();

            vetorB[i] = vetorA[i] * vetorA[i] * vetorA[i];
        }

        System.out.println("Vetor B:");

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("B[" + i + "] = " + vetorB[i]);
        }

        sc.close();
    }
}