import java.util.Scanner;

public class SalarioFinal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é o seu salário base? R$ ");

        double salarioBase = sc.nextDouble();

        System.out.print("Qual o valor do bônus deste mês? R$ ");

        double bonus = sc.nextDouble();

        System.out.print("Qual o total de descontos? R$ ");

        double descontos = sc.nextDouble();
        
        double salarioLiquido = (salarioBase + bonus) - descontos;
        
        System.out.println("Seu salário líquido final será: R$ " + salarioLiquido);
        sc.close();
    }
}