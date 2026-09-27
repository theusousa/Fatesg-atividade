public class ContaInvestimento extends Conta {
    public ContaInvestimento(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public double calcularRendimento() {
        return getSaldo() * 0.01;
    }
}
