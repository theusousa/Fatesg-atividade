import java.util.Scanner;

public class TempoViagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tempo total da viagem em minutos: ");
        
        int minutosTotais = sc.nextInt();
        
        int horas = minutosTotais / 60;
    
        int minutos = minutosTotais % 60;
        
        System.out.println("O tempo de viagem foi de " + horas + " hora(s) e " + minutos + " minuto(s).");
        sc.close();
    }
}