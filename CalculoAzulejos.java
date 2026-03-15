import java.util.Scanner;

public class CalculoAzulejos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Altura da parede (metros): ");
        double alturaParede = sc.nextDouble();
        System.out.print("Largura da parede (metros): ");
        double larguraParede = sc.nextDouble();
        
        System.out.print("Altura do azulejo (metros): ");
        double alturaAzulejo = sc.nextDouble();
        System.out.print("Largura do azulejo (metros): ");
        double larguraAzulejo = sc.nextDouble();
        
        double areaParede = alturaParede * larguraParede;
        double areaAzulejo = alturaAzulejo * larguraAzulejo;
        
        
        double qtdAzulejos = Math.ceil(areaParede / areaAzulejo);
        System.out.println("Você precisará de aproximadamente " + qtdAzulejos + " azulejos.");
        sc.close();
    }
}