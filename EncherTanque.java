import java.util.Scanner;

public class EncherTanque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Capacidade máxima do tanque (em litros): ");
        double capacidadeTotal = sc.nextDouble();
        System.out.print("Quantidade atual de combustível no tanque: ");
        double qtdAtual = sc.nextDouble();
        
        double litrosFaltantes = capacidadeTotal - qtdAtual;
        System.out.println("Faltam " + litrosFaltantes + " litros para encher o tanque completamente.");
        sc.close();
    }
}