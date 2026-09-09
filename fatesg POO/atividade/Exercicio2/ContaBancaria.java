public class ContaBancaria {

    private String titular;
    private String numeroConta;
    private double saldo;
    private String tipoConta;

    public ContaBancaria(String titular, String numeroConta, String tipoConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;

        if (saldoInicial < 0) {
            this.saldo = 0;
            System.out.println("Aviso: saldo inicial negativo. Conta criada com saldo 0.");
        } else {
            this.saldo = saldoInicial;
        }
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Erro: valor invalido para deposito.");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: valor invalido.");
        } else if (valor > saldo) {
            System.out.println("Erro: saldo insuficiente.");
        } else {
            saldo -= valor;
        }
    }
}
