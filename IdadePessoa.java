import java.util.Scanner;

public class IdadePessoa {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ano de nascimento: ");
        int anoNasc = sc.nextInt();
        System.out.print("Ano atual: ");
        int anoAtual = sc.nextInt();

        System.out.println("Idade aproximada: " + (anoAtual - anoNasc));
        sc.close();
    }
}