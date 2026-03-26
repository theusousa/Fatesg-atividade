import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Primeira NOTA: ");
        Float nota1 = sc.nextFloat();

        System.out.println("Digite a segunda NOTA: ");
        float nota2 = sc.nextFloat();
        
        float notaf = (nota1 + nota2) / 2;

        if(notaf >= 7){
            System.out.println("Aluno aprovado");
        }else if(notaf >=5 ){
            System.out.println("Aluno esta de recuperação");
        }else{
            System.out.println("Aluno reprovado");
        }
        sc.close();
    }

    
}
