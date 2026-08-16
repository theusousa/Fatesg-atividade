public class Estacionamento {
    String placa;
    int horasEstacionadas;

    public double calcularValorCobranca() {
        if (horasEstacionadas <= 0) {
            return 0.0;
        }

        return 8.0 + (horasEstacionadas - 1) * 5.0;
    }

    public void exibirTiquete() {
        System.out.println("Tiquete do estacionamento");
        System.out.println("Placa: " + placa);
        System.out.println("Horas estacionadas: " + horasEstacionadas);
        System.out.println("Valor a pagar: R$ " + calcularValorCobranca());
    }

}
