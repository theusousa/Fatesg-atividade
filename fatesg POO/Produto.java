public class Produto {
    String nome;
    double preco;
    int quantidadeEmEstoque;

    public void vender(int quantidade) {
        if (quantidade > quantidadeEmEstoque) {
            System.out.println("Nao ha estoque suficiente.");
        } else {
            quantidadeEmEstoque = quantidadeEmEstoque - quantidade;
            System.out.println("Venda realizada.");
        }
    }

    public void reabastecer(int quantidade) {
        quantidadeEmEstoque = quantidadeEmEstoque + quantidade;
        System.out.println("Produto reabastecido.");
    }

    public void exibirInformacao() {
        System.out.println("Produto: " + nome);
        System.out.println("Preco: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }
}
