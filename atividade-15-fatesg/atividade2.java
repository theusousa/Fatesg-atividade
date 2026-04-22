import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota = 0;
        int soma = 0;
        int contador = 0;

        System.out.println("Digite as notas (Digite 1 para parar):");
        nota = sc.nextInt();

        while (nota != 1) {
            soma += nota;
            contador++;

            nota = sc.nextInt();
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.err.println("Média: " + media);
        } else {
            System.out.println("nenhuma nota válida foi digitada");
        }

        sc.close();

    }
}
