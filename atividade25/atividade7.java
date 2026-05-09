// Atividade7.java
import java.util.Scanner;

public class atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Digite o valor de X: ");
        int x = sc.nextInt();

        System.out.println("Resultado:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] * x;
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}