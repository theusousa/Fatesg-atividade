import java.util.Scanner;

public class TempoTrabalhoSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double horasTotais = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Horas trabalhadas no dia " + i + ": ");
            horasTotais = horasTotais + sc.nextDouble();
        }
        
        System.out.println("Você trabalhou um total de " + horasTotais + " horas nesta semana.");
        sc.close();
    }
}