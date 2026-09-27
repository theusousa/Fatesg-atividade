public class Corrida {
    private String origem;
    private String destino;
    private double distancia;

    public Corrida(String origem, String destino, double distancia) {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double calcularValor() {
        return distancia * 2;
    }

    public double calcularValor(double desconto) {
        return calcularValor() - desconto;
    }
}
