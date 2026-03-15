import java.util.Scanner;

public class ConsumoViagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Distância total da viagem (km): ");
        double distancia = sc.nextDouble();
        System.out.print("Rendimento médio do veículo (km/l): ");
        double rendimento = sc.nextDouble();
        
        double litrosNecessarios = distancia / rendimento;
        System.out.println("Serão necessários " + litrosNecessarios + " litros de combustível.");
        sc.close();
    }
}