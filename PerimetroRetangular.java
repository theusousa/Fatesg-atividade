import java.util.Scanner;

public class PerimetroRetangular {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Base do terreno: ");
        double baseTerreno = sc.nextDouble();
        System.out.print("Altura do terreno: ");
        double alturaTerreno = sc.nextDouble();
        System.out.println("Perímetro: " + (2 * (baseTerreno + alturaTerreno)));
        sc.close();
    }
}