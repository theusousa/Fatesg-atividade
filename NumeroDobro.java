import java.util.Scanner;

public class NumeroDobro {
    public static void main (String[]arg){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double n1 = sc.nextDouble();
        System.out.println("Resultado: " + n1 * 2);
        sc.close();
    } 
}