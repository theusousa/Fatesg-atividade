public class Filme {
    String titulo;
    String diretor;
    int anoLancamento;
    double duracaoEmHoras;

    public void exibirDetalhes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Ano de lancamento: " + anoLancamento);
        System.out.println("Duracao em horas: " + duracaoEmHoras);
    }

    public boolean verificarFilmeClassico() {
        int anoAtual = 2026;

        if (anoAtual - anoLancamento > 30) {
            return true;
        } else {
            return false;
        }
    }
}
