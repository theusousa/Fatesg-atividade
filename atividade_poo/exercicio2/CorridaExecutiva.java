public class CorridaExecutiva extends Corrida {
    public CorridaExecutiva(String origem, String destino, double distancia) {
        super(origem, destino, distancia);
    }

    @Override
    public double calcularValor() {
        return getDistancia() * 4;
    }
}
