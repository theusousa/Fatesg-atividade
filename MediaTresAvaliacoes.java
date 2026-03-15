import java.util.Scanner;

public class MediaTresAvaliacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota da 1 avaliação: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a nota da 2 avaliação: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a nota da 3 avaliação: ");
        double nota3 = sc.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média das avaliações é: " + media);
        sc.close();
    }
}