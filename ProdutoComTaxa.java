import java.util.Scanner;

public class ProdutoComTaxa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor original do produto: R$ ");
        double valorOriginal = sc.nextDouble();
        System.out.print("Porcentagem da taxa: ");
        double taxa = sc.nextDouble();
        
        double valorFinal = valorOriginal + (valorOriginal * (taxa / 100));
        System.out.println("Valor final com a taxa: R$ " + valorFinal);
        sc.close();
    }
}