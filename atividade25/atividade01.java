import java.util.Scanner;

public class atividade01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite os valores do vetor: ");
            vetor[i] = sc.nextInt();

        }

        for (int numero : vetor) {
            System.out.println("A lista dos vetores é " + numero);
        }

    }
}
