import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        String operacao;
        double soma;

        System.out.println("Digite um valor da tabuada");
        numero = sc.nextInt();

        System.out.println("Digite a operacao (+, -, * ou /):");
        operacao = sc.next();

        for (int i = 1; i < 11; i++) {
            if (operacao.equals("+")) {
                soma = numero + i;
                System.out.println(numero + " + " + i + " = " + soma);
            } else if (operacao.equals("-")) {
                soma = numero - i;
                System.out.println(numero + " - " + i + " = " + soma);
            } else if (operacao.equals("*")) {
                soma = numero * i;
                System.out.println(numero + " * " + i + " = " + soma);
            } else if (operacao.equals("/")) {
                soma = numero / i;
                System.out.println(numero + " / " + i + " = " + soma);
            }
        }
        sc.close();
    }
}
