import java.util.Scanner;

public class atividade5 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numerosPares = 0;
    int numerosImpares = 0;
    int numero = 0;
    int contador = 0;

    

    for (int i = contador; i < 20; i++) {
        System.out.println("Digite O valor numerico");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            numerosPares++;
        }else {
            numerosImpares++;
        }

    }

    System.out.println("quantidades de numeros Pares: " + numerosPares);
    System.out.println("quantidades de numeros Imapares: " + numerosImpares);

    sc.close();
}
    
}