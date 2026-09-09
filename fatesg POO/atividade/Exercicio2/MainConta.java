public class MainConta {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Mariana Alves", "00123-4", "Corrente", 500.00);

        System.out.println("=== Conta criada ===");
        System.out.println("Titular: " + conta.getTitular() + " | Saldo: " + conta.getSaldo());

        System.out.println("\n=== Teste de saque maior que o saldo ===");
        System.out.println("Saldo antes: " + conta.getSaldo());
        conta.sacar(800.00);
        System.out.println("Saldo depois: " + conta.getSaldo());

        System.out.println("\n=== Teste de depósito e saque válidos ===");
        conta.depositar(300.00);
        System.out.println("Saldo depois do depósito: " + conta.getSaldo());
        conta.sacar(700.00);
        System.out.println("Saldo depois do saque: " + conta.getSaldo());

        System.out.println("\n=== Teste de acesso direto ao saldo ===");
        // conta.saldo = 999999;
        System.out.println("A linha acima nao compila, pois saldo e private.");
    }
}
