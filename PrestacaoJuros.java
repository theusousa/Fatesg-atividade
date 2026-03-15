import java.util.Scanner;

public class PrestacaoJuros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor original da prestação: R$ ");
        double valor = sc.nextDouble();
        System.out.print("Taxa de juros ao mês (%): ");
        double taxa = sc.nextDouble();
        System.out.print("Dias em atraso: ");
        int dias = sc.nextInt();
        
        
        double valorComJuros = valor + (valor * (taxa / 100) * ((double) dias / 30));
        System.out.println("Valor da prestação atualizada: R$ " + valorComJuros);
        sc.close();
    }
}