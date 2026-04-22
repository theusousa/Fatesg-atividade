import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num01, num02 = 0;

        System.out.println("Digite o primeiro valor");
        num01 = sc.nextInt();
        System.out.println("Digite o segundo valor");
        num02 = sc.nextInt();

        for (int i = num01; i <= num02; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        sc.close();

    }
}
