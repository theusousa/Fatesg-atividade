import java.util.Scanner;

public class CorridaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor fixo inicial (bandeirada): R$ ");
        double taxaFixa = sc.nextDouble();
        System.out.print("Valor cobrado por quilômetro: R$ ");
        double valorKm = sc.nextDouble();
        System.out.print("Distância da corrida (em km): ");
        double distancia = sc.nextDouble();
        
        double valorTotal = taxaFixa + (valorKm * distancia);
        System.out.println("O valor total da corrida é: R$ " + valorTotal);
        sc.close();
    }
}