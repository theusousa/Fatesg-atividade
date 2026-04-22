import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maiorIdade = 0;
        int menorIdade = 0;
        int idade;
        int contador = 0;

        while (contador < 20) {
            System.out.println("Digite a Idade: ");
            idade = sc.nextInt();

            if (idade >= 18) {
                maiorIdade++;
            } else {
                menorIdade++;
            }

            contador++;
        }

        System.out.println("Maiores de idade: " + maiorIdade);
        System.out.println("Menores de idade " + menorIdade);
        sc.close();
    }
}
