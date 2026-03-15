import java.util.Scanner;

public class Multiplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número 1 para multiplicação: ");
        double mult1 = sc.nextDouble();
        System.out.print("Número 2: ");
        double mult2 = sc.nextDouble();
        System.out.println("Resultado: " + (mult1 * mult2));
        sc.close();
    }
}
