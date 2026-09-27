public class ProdutoAlimenticio extends Produto {
    public ProdutoAlimenticio(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularFrete() {
        return 8;
    }
}
