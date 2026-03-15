import java.util.Scanner;

public class Subtracao {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Número 1 para subtração: ");
        double sub1 = sc.nextDouble();
        System.out.print("Número 2: ");
        double sub2 = sc.nextDouble();
        System.out.println("Resultado: " + (sub1 - sub2));
        sc.close();
    }
}
