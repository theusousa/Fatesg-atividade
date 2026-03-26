import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do produto: R$");
        double valor1 = sc.nextDouble();

        System.out.println("Qual é o desconto:");
        double desconto = sc.nextDouble();

        double valorDesconto = valor1 * (desconto/100);
        double valorFinal = valor1 - valorDesconto;

        System.out.printf("Valor do Desconto %.2f\n", valorDesconto);
        System.out.printf("O valor Final é: %.2f\n", valorFinal);

        if(valorDesconto > 50){
            System.out.println("Desconto muito alto!.");
        }
        sc.close();
    }
}
