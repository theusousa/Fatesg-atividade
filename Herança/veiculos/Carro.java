package veiculos;

public class Carro extends Veiculo {
    protected int numeroDePorta;

    public Carro (String nome, String modelo, int ano, int numeroDePorta) {
        super(nome, modelo, ano);
        this.numeroDePorta = numeroDePorta;
    }
    
    @Override 
    public void acelerar() {
        System.out.println("Carro esta acelerando");
    }
}
