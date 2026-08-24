public class Livro {
    public String titulo;
    public String autor;
    public int paginas;
    

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void exibirInformacoes(){
        System.out.print("titulo" + titulo);
        System.out.print("pagina" + paginas);
    }    
}