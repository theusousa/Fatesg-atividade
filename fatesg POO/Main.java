public class Main {
    public static void main(String[] args) {
        Estacionamento carro = new Estacionamento();
        carro.placa = "ABC-1234";
        carro.horasEstacionadas = 3;
        carro.exibirTiquete();

        System.out.println();

        Produto produto = new Produto();
        produto.nome = "Caderno";
        produto.preco = 25.0;
        produto.quantidadeEmEstoque = 10;
        produto.vender(3);
        produto.reabastecer(5);
        produto.exibirInformacao();

        System.out.println();

        Filme filme = new Filme();
        filme.titulo = "Titanic";
        filme.diretor = "James Cameron";
        filme.anoLancamento = 1997;
        filme.duracaoEmHoras = 3.2;
        filme.exibirDetalhes();
        System.out.println("E classico? " + filme.verificarFilmeClassico());

        System.out.println();

        Paciente paciente = new Paciente();
        paciente.nome = "Joao";
        paciente.peso = 70.0;
        paciente.altura = 1.75;
        paciente.idade = 25;
        paciente.exibirFicha();

        System.out.println();

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Maria";
        funcionario.salarioBruto = 2200.0;
        funcionario.horasExtras = 10;
        funcionario.exibirContracheque();
    }
}
