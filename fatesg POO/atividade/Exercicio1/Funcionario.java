public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;
    private String cargo;
    private int matricula;

    public Funcionario(String nome, String cpf, double salario, String cargo, int matricula) {
        this.nome = nome;
        this.cargo = cargo;
        this.matricula = matricula;
        setCpf(cpf);
        setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf != null && cpf.length() == 11) {
            this.cpf = cpf;
        } else {
            System.out.println("Erro: CPF invalido. O CPF deve ter exatamente 11 caracteres.");
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("Erro: salario invalido. O salario deve ser maior que zero.");
        }
    }

    public String getCargo() {
        return cargo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void aplicarAumento(double percentual) {
        setSalario(salario + salario * percentual / 100);
    }
}
