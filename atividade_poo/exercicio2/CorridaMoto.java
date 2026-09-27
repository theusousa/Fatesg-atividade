public class CorridaMoto extends Corrida {
    public CorridaMoto(String origem, String destino, double distancia) {
        super(origem, destino, distancia);
    }

    @Override
    public double calcularValor() {
        return getDistancia() * 1.5;
    }
}
