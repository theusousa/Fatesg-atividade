public class Main{
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes",259);
        Livro livro2 = new Livro("Cem Anos de Solidão", "Gabriel García Márquez",200);


        System.out.println("Livro 1 -> " + livro1.titulo + "(" + livro1.paginas + "paginas");
        System.out.println("Livro 2 -> " + livro2.titulo + "(" + livro2.paginas + "paginas");
    }
}