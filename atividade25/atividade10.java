// Atividade10.java
import java.util.Scanner;

public class atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] alunos = new String[5];
        double[] medias = new double[5];

        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Digite o nome do aluno: ");
            alunos[i] = sc.nextLine();

            System.out.print("Digite a média do aluno: ");
            medias[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("Alunos aprovados:");

        for (int i = 0; i < alunos.length; i++) {
            if (medias[i] >= 7.0) {
                System.out.println(alunos[i] + " - Média: " + medias[i]);
            }
        }

        sc.close();
    }
}