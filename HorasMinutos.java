import java.util.Scanner;

public class HorasMinutos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);       

        System.out.print("Quantidade de horas: ");
        double horas = sc.nextDouble();
        System.out.println("Em minutos: " + (horas * 60));
        sc.close();
    }
}
