import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println("Notas digitadas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        System.out.println("Média final: " + media);

        sc.close();
    }
}