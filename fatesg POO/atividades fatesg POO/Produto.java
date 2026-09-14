public class Produto {
    String nome;
    double preco;
    int quantidade;

    // Construtor completo
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Chama o construtor completo com quantidade padrão = 1
    public Produto(String nome, double preco) {
        this(nome, preco, 1);
    }

    public void exibir() {
        System.out.println(nome + " | R$ " + preco + " | qtd: " + quantidade);
    }
}
