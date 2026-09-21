package funcionarios;

public class Estagiario extends Funcionario{
    protected double desconto;

    public Estagiario (String nome, double salario, double desconto){
       super(nome,salario);
        this.desconto = desconto;
    }
    @Override 
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("desconto: " + desconto);
        System.out.println("Total: " + (salario - desconto));
    }
}
