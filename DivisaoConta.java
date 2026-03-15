import java.util.Scanner;

public class DivisaoConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor total da conta: R$ ");
        double conta = sc.nextDouble();
        System.out.print("Quantidade de pessoas: ");
        int pessoas = sc.nextInt();
        
        double valorPorPessoa = conta / pessoas;
        System.out.println("Cada um deve pagar: R$ " + valorPorPessoa);
        sc.close();
    }
}
