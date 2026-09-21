package veiculos;

public class MainVeiculos {
    public static void main(String[] args) {
        Carro carro = new Carro("Corsa", "Hatchback", 2012, 4);
        Moto moto = new Moto("Honda", "CG 160", 2020, 160);
        Caminhao caminhao = new Caminhao("Volvo", "FH 540", 2018, 25000.0);

        carro.acelerar();
        carro.frear();
        System.out.println("");

        moto.acelerar();
        moto.frear();
        System.out.println("");

        caminhao.acelerar();
        caminhao.frear();
    }
}
