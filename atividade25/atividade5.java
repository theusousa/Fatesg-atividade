// Atividade5.java
import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[8];
        boolean encontrado = false;

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = sc.nextLine();
        }

        System.out.print("Digite o nome que deseja buscar: ");
        String nomeBusca = sc.nextLine();

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                System.out.println("Nome encontrado na posição: " + i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nome não encontrado.");
        }

        sc.close();
    }
}