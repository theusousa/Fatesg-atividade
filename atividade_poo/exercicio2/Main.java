public class Main {
    public static void main(String[] args) {
        Corrida carro = new CorridaCarro("Centro", "Shopping", 10);
        Corrida moto = new CorridaMoto("Setor Bueno", "Aeroporto", 10);
        Corrida executiva = new CorridaExecutiva("Hotel", "Rodoviaria", 10);

        System.out.println("Corrida de carro: " + carro.getOrigem() + " ate " + carro.getDestino());
        System.out.println("Valor: R$ " + carro.calcularValor());
        System.out.println("Valor com desconto: R$ " + carro.calcularValor(5));
        System.out.println();

        System.out.println("Corrida de moto: " + moto.getOrigem() + " ate " + moto.getDestino());
        System.out.println("Valor: R$ " + moto.calcularValor());
        System.out.println("Valor com desconto: R$ " + moto.calcularValor(5));
        System.out.println();

        System.out.println("Corrida executiva: " + executiva.getOrigem() + " ate " + executiva.getDestino());
        System.out.println("Valor: R$ " + executiva.calcularValor());
        System.out.println("Valor com desconto: R$ " + executiva.calcularValor(5));
    }
}
