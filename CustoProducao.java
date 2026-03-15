import java.util.Scanner;

public class CustoProducao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Custo com matéria-prima: R$ ");
        double materiaPrima = sc.nextDouble();
        System.out.print("Custo com mão de obra: R$ ");
        double maoDeObra = sc.nextDouble();
        
        double custoTotal = materiaPrima + maoDeObra;
        System.out.println("O custo total para produzir este item foi de: R$ " + custoTotal);
        sc.close();
    }
}