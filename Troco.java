import java.util.Scanner;
public class Troco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor pago pelo cliente: ");
        double pago = sc.nextDouble();
        System.out.print("Valor total da compra: ");
        double compra = sc.nextDouble();
        System.out.println("Troco a devolver: " + (pago - compra));
        sc.close();
    }
}
