import java.util.Scanner;

public class NumeroTriplo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para o triplo: ");
        double n4 = sc.nextDouble();
        System.out.println("Resultado: " + (n4 * 3));
        sc.close();
    }
}
