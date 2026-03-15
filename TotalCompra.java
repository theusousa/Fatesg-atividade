import java.util.Scanner;

public class TotalCompra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Preço unitário do produto: R$ ");

        double preco = sc.nextDouble();

        System.out.print("Quantidade comprada: ");

        int quantidade = sc.nextInt();
        
        double total = preco * quantidade;
        
        System.out.println("Valor total da compra: R$ " + total);
        sc.close();
    }
}