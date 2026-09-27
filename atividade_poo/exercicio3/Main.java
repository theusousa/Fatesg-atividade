public class Main {
    public static void main(String[] args) {
        Produto p1 = new ProdutoEletronico("Celular", 1500);
        Produto p2 = new ProdutoVestuario("Camiseta", 80);
        Produto p3 = new ProdutoAlimenticio("Arroz", 25);

        System.out.println("Produto: " + p1.getNome());
        System.out.println("Preco: R$ " + p1.calcularPreco());
        System.out.println("Preco com desconto: R$ " + p1.calcularPreco(100));
        System.out.println("Frete: R$ " + p1.calcularFrete());
        System.out.println();

        System.out.println("Produto: " + p2.getNome());
        System.out.println("Preco: R$ " + p2.calcularPreco());
        System.out.println("Preco com desconto: R$ " + p2.calcularPreco(10));
        System.out.println("Frete: R$ " + p2.calcularFrete());
        System.out.println();

        System.out.println("Produto: " + p3.getNome());
        System.out.println("Preco: R$ " + p3.calcularPreco());
        System.out.println("Preco com desconto: R$ " + p3.calcularPreco(5));
        System.out.println("Frete: R$ " + p3.calcularFrete());
    }
}
