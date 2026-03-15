import java.util.Scanner;

public class ProdutoComDesconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o valor do produto? R$ ");
        double preco = sc.nextDouble();
        System.out.print("Qual a porcentagem de desconto? ");
        double desconto = sc.nextDouble();
        
        double valorDesconto = preco * (desconto / 100);
        double precoFinal = preco - valorDesconto;
        
        System.out.println("O produto sairá por: R$ " + precoFinal);
        sc.close();
    }
}