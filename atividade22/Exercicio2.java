class Corrida {
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

class CorridaCarro extends Corrida {
    public CorridaCarro(String origem, String destino, double distancia) {
        super(origem, destino, distancia);
    }

    @Override
    public double calcularValor() {
        return getDistancia() * 2.5;
    }
}

class CorridaMoto extends Corrida {
    public CorridaMoto(String origem, String destino, double distancia) {
        super(origem, destino, distancia);
    }

    @Override
    public double calcularValor() {
        return getDistancia() * 1.5;
    }
}

class CorridaExecutiva extends Corrida {
    public CorridaExecutiva(String origem, String destino, double distancia) {
        super(origem, destino, distancia);
    }

    @Override
    public double calcularValor() {
        return getDistancia() * 4;
    }
}

public class Exercicio2 {
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
