package veiculos;

public class Caminhao extends Veiculo {
    protected double capacidadeCarga;

    public Caminhao (String marca, String modelo, int ano, double capacidadeCarga) {
        super(marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void acelerar() {
        System.out.println("Caminhao esta acelerando");
    }
}
