import java.util.Scanner;

public class DiasVividos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos anos completos você tem? ");
        int anos = sc.nextInt();
        
        int dias = anos * 365;
        System.out.println("Você já viveu aproximadamente " + dias + " dias!");
        sc.close();
    }
}