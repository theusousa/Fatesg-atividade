import java.util.Scanner;

public class DescontoEAcrescimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor total da compra: R$ ");
        double valor = sc.nextDouble();
        System.out.print("Porcentagem de desconto (%): ");
        double desconto = sc.nextDouble();
        System.out.print("Porcentagem de taxa a ser acrescida depois (%): ");
        double taxa = sc.nextDouble();
        
        double valorComDesconto = valor - (valor * (desconto / 100));
        
        double valorFinal = valorComDesconto + (valorComDesconto * (taxa / 100));
        
        System.out.println("O valor final a ser pago é: R$ " + valorFinal);
        sc.close();
    }
}