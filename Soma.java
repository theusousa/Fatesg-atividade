import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número 1 para soma: ");
        double soma1 = sc.nextDouble();
        System.out.print("Número 2: ");
        double soma2 = sc.nextDouble();
        System.out.println("Resultado: " + (soma1 + soma2));
        sc.close();
    }
}
