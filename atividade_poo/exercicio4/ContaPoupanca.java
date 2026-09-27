public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public double calcularRendimento() {
        return getSaldo() * 0.005;
    }
}
