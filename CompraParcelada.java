import java.util.Scanner;

public class CompraParcelada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor de cada parcela: R$ ");
        double valorParcela = sc.nextDouble();
        System.out.print("Quantidade de parcelas: ");
        int qtdParcelas = sc.nextInt();
        
        double totalPago = valorParcela * qtdParcelas;
        System.out.println("O valor total pago ao final será: R$ " + totalPago);
        sc.close();
    }
}