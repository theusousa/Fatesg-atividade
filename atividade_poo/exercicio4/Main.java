public class Main {
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
