import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Lado do quadrado: ");
        double lado = sc.nextDouble();
        System.out.println("Área: " + (lado * lado));
        sc.close();
    }
}
