import java.util.Scanner;

public class ConsumoCombustivel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Distância percorrida (em km): ");

        double km = sc.nextDouble();

        System.out.print("Quantidade de combustível gasto (em litros): ");

        double litros = sc.nextDouble();
        
        double consumoMedio = km / litros;
        
        System.out.println("O consumo médio foi de: " + consumoMedio + " km/l");
        sc.close();
    }
}