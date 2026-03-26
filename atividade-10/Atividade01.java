import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean par = false;

        System.out.println("Digite o valor");
        int valor = sc.nextInt();

        if(valor % 2 == 0){
            par = true;
        }
        

        if(valor >= 1 && par){
            System.out.println("O valor e Positivo e par");
       }else if(valor >= 1 != par){
            System.out.println("O numero e Positivo e impar");
       }else if (valor == 0){
            System.out.println("O valor e Par");
       }else if(valor <= 0 && par){
        System.out.println("O valor é negativo é Par");
       }else if(valor <= 0 != par){
        System.out.println("O numero é negativo é impar");
       }
       sc.close();
    }
}
