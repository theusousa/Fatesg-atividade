package funcionarios;

public class Engenheiro extends Funcionario{
    protected String nivel;

    public Engenheiro (String nome, double salario, String nivel) {
        super(nome, salario);
        this.nivel = nivel;
    }

    @Override 
     public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Nivel: " + nivel);

     }
}
