public class ContaDigital extends Conta {
    public ContaDigital(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public double calcularRendimento() {
        return getSaldo() * 0.002;
    }
}
