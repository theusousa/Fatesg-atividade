import java.util.Scanner;

public class ContaEnergia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Consumo de energia no mês: ");
        double consumo = sc.nextDouble();
        System.out.print("Valor cobrado: R$ ");
        double valorKwh = sc.nextDouble();
        
        double valorConta = consumo * valorKwh;
        System.out.println("O valor da conta de energia será: R$ " + valorConta);
        sc.close();
    }
}