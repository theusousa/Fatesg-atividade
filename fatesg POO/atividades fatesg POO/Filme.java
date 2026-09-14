public class Filme {
    String titulo;
    String diretor;
    int duracao;

    // Construtor completo
    public Filme(String titulo, String diretor, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    // Construtor apenas com o titulo
    public Filme(String titulo) {
        this.titulo = titulo;
        this.diretor = "Diretor Desconhecido";
        this.duracao = 120;
    }

    public void exibir() {
        System.out.println(titulo + " | " + diretor + " | " + duracao + " min");
    }
}
