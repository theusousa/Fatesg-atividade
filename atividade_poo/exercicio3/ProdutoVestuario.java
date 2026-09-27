public class ProdutoVestuario extends Produto {
    public ProdutoVestuario(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularFrete() {
        return 15;
    }
}
