package funcionarios;

public class Gerente extends Funcionario{
   protected  double bonificacao;

    public Gerente(String nome, double salario, double bonificacao) {
        super(nome,salario);
        this.bonificacao = bonificacao;
    }

    @Override 
    public void exibirInformacoes () {
        super.exibirInformacoes();
        System.out.println("Bonificacao: " + bonificacao);
        System.out.println("Total: " + (salario+bonificacao));
    }
}
