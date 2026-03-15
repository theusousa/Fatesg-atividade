import java.util.Scanner;

public class AreaTerrenoComposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Parte 1 do terreno");
        System.out.print("Largura: ");
        double larg1 = sc.nextDouble();
        System.out.print("Comprimento: ");
        double comp1 = sc.nextDouble();
        
        System.out.println("Parte 2 do terreno");
        System.out.print("Largura: ");
        double larg2 = sc.nextDouble();
        System.out.print("Comprimento: ");
        double comp2 = sc.nextDouble();
        
        double area1 = larg1 * comp1;
        double area2 = larg2 * comp2;
        double areaTotal = area1 + area2;
        
        System.out.println("A área total do terreno é: " + areaTotal);
        sc.close();
    }
}