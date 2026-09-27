class Conta {
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

class ContaPoupanca extends Conta {
    public ContaPoupanca(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public double calcularRendimento() {
        return getSaldo() * 0.005;
    }
}

class ContaInvestimento extends Conta {
    public ContaInvestimento(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public double calcularRendimento() {
        return getSaldo() * 0.01;
    }
}

class ContaDigital extends Conta {
    public ContaDigital(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public double calcularRendimento() {
        return getSaldo() * 0.002;
    }
}

public class Exercicio4 {
    public static void main(String[] args) {
        Conta c1 = new ContaPoupanca(1, "Ana", 1000);
        Conta c2 = new ContaInvestimento(2, "Carlos", 2000);
        Conta c3 = new ContaDigital(3, "Julia", 500);

        System.out.println("Conta " + c1.getNumero() + " - " + c1.getTitular());
        c1.depositar(200);
        System.out.println("Saldo: R$ " + c1.getSaldo());
        System.out.println("Rendimento: R$ " + c1.calcularRendimento());
        System.out.println();

        System.out.println("Conta " + c2.getNumero() + " - " + c2.getTitular());
        c2.depositar(1000, "Salario");
        System.out.println("Saldo: R$ " + c2.getSaldo());
        System.out.println("Rendimento: R$ " + c2.calcularRendimento());
        System.out.println();

        System.out.println("Conta " + c3.getNumero() + " - " + c3.getTitular());
        c3.depositar(50, "Pix");
        System.out.println("Saldo: R$ " + c3.getSaldo());
        System.out.println("Rendimento: R$ " + c3.calcularRendimento());
    }
}
