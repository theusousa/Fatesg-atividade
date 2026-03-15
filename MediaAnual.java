import java.util.Scanner;

public class MediaAnual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota do 1 bimestre: ");
        double b1 = sc.nextDouble();
        System.out.print("Nota do 2 bimestre: ");
        double b2 = sc.nextDouble();
        System.out.print("Nota do 3 bimestre: ");
        double b3 = sc.nextDouble();
        System.out.print("Nota do 4 bimestre: ");
        double b4 = sc.nextDouble();
        
        double media = (b1 + b2 + b3 + b4) / 4;
        System.out.println("A média anual do aluno é: " + media);
        sc.close();
    }
}