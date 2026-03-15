import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numerador: ");
        double div1 = sc.nextDouble();
        System.out.print("Denominador: ");
        double div2 = sc.nextDouble();
        System.out.println("Resultado: " + (div1 / div2));
        sc.close();
    }
}
