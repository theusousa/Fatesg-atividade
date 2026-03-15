import java.util.Scanner;

public class PontosJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de vitórias (3 pontos cada): ");
        int vitorias = sc.nextInt();
        System.out.print("Quantidade de empates (1 ponto cada): ");
        int empates = sc.nextInt();
        
        int pontosTotais = (vitorias * 3) + empates;
        
        System.out.println("Pontuação total da equipe: " + pontosTotais + " pontos.");
        sc.close();
    }
}