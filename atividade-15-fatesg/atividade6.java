import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int accountant = 0;
        int numbUser = 0;
        int numbOne = 0;
        int numbTwoHundred = 0;
        int numbGreaterThan = 0;

        while (accountant < 20) {
            System.out.println("Digite os valores: ");
            numbUser = sc.nextInt();
            accountant++;

            if (numbUser > 0 && numbUser <= 100) {
                numbOne++;

            } else if (numbUser <= 200) {
                numbTwoHundred++;
            } else {
                numbGreaterThan++;
            }
        }

        System.out.printf("numeros entre 0 & 100 %d\n",numbOne);
        System.out.printf("numeros entre 101 & 200 %d\n",numbTwoHundred);
        System.out.printf("numeros maiores que 200 %d\n",numbGreaterThan);

        sc.close();
    }
}
