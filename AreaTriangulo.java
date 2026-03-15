import java.util.Scanner;
public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Base do triângulo: ");
        double baseTri = sc.nextDouble();
        System.out.print("Altura do triângulo: ");
        double alturaTri = sc.nextDouble();
        System.out.println("Área: " + ((baseTri * alturaTri) / 2));
        sc.close();
    }

}
