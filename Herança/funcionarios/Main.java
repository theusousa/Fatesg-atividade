package funcionarios;

public class Main {
    public static void main(String[] args) {
        Gerente matheusGerente = new Gerente("Matheus", 20000, 2000);
        Funcionario eduardFuncionario = new Funcionario("Eduardo", 3000);
        Estagiario mariaEstagiario = new  Estagiario("Maria", 1000, 100);
        Engenheiro siceleneEngenheiro = new Engenheiro("Sicelene", 8000, "Senior");

        matheusGerente.exibirInformacoes();
        System.out.println("");
        eduardFuncionario.exibirInformacoes();
        System.out.println("");
        mariaEstagiario.exibirInformacoes();
        System.out.println("");
        siceleneEngenheiro.exibirInformacoes();
    }
}
