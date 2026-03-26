import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual é a sua idade? ");
        float idade = sc.nextFloat();
        
        if (idade >= 60) {
            System.out.println("IDOSO");
        }else if(idade >= 18){
            System.out.println("Adulto");
        }else{
            System.out.println("CRIANÇA");
        }
        sc.close();
    }
}
