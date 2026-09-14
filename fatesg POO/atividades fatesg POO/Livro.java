public class Livro {
    String titulo;
    String autor;
    int paginas;

    // Construtor completo
    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Construtor apenas com o titulo (demais atributos com valor padrão)
    public Livro(String titulo) {
        this.titulo = titulo;
        this.autor = "Autor Desconhecido";
        this.paginas = 0;
    }

    public void exibir() {
        System.out.println(titulo + " | " + autor + " | " + paginas + " páginas");
    }
}
