import java.util.Scanner;;

public class Quadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Digite um número para o quadrado: ");
        double n5 = sc.nextDouble();
        System.out.println("Resultado: " + (n5 * n5));
        sc.close();
    }
}
