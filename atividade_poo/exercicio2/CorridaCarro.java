public class CorridaCarro extends Corrida {
    public CorridaCarro(String origem, String destino, double distancia) {
        super(origem, destino, distancia);
    }

    @Override
    public double calcularValor() {
        return getDistancia() * 2.5;
    }
}
