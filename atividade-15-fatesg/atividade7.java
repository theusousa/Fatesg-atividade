import java.util.Scanner;

public class atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(a + " ");


            int proxNumero = a + b;
            
            a = b;
            b = proxNumero;

            
        }

    }
}
