public class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double calcularRendimento() {
        return 0;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("Deposito de R$ " + valor + " feito");
    }

    public void depositar(double valor, String descricao) {
        saldo = saldo + valor;
        System.out.println("Deposito de R$ " + valor + " feito - " + descricao);
    }
}
