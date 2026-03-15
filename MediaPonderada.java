import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota e em seguida o seu peso: ");
        double nota1 = sc.nextDouble();
        double peso1 = sc.nextDouble();
        
        System.out.print("Digite a segunda nota e em seguida o seu peso: ");
        double nota2 = sc.nextDouble();
        double peso2 = sc.nextDouble();
        
        System.out.print("Digite a terceira nota e em seguida o seu peso: ");
        double nota3 = sc.nextDouble();
        double peso3 = sc.nextDouble();
    
        
        double somaPesos = peso1 + peso2 + peso3;
        double mediaPond = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / somaPesos;
        
        System.out.println("A média ponderada final é: " + mediaPond);
        sc.close();
    }
}