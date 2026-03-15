import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Horas trabalhadas no mês: ");

        double horas = sc.nextDouble();

        System.out.print("Valor da sua hora de trabalho: R$ ");

        double valorHora = sc.nextDouble();
        
        double salario = horas * valorHora;
        
        System.out.println("Seu salário mensal é: R$ " + salario);
        sc.close();
    }
}