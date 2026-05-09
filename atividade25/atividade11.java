// Atividade11.java
import java.util.Scanner;

public class atividade11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        boolean iguais = true;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite A[" + i + "]: ");
            vetorA[i] = sc.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Digite B[" + i + "]: ");
            vetorB[i] = sc.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] != vetorB[i]) {
                iguais = false;
                break;
            }
        }

        if (iguais) {
            System.out.println("Os vetores são iguais.");
        } else {
            System.out.println("Os vetores são diferentes.");
        }

        sc.close();
    }
}