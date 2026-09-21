package veiculos;

public class Moto extends Veiculo {
    protected int cilindradas;

    public Moto (String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void acelerar() {
        System.out.println("Moto esta acelerando");
    }
}
