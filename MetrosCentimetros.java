import java.util.Scanner;

public class MetrosCentimetros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor em metros: ");
        double metros = sc.nextDouble();
        System.out.println("Em centímetros: " + (metros * 100));
        sc.close();

    }
}
