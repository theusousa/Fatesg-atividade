public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Matheus", "0258965474", 2500.00, "auxiliar de TI", 202635745);
        Funcionario funcionario2 = new Funcionario("Eduardo", "5874521258", 2100.00, "personal", 52582551);

        System.out.println("=== Funcionários criados ===");
        System.out.println("Func1 - Nome: " + funcionario1.getNome() + " | Salário: " + funcionario1.getSalario());
        System.out.println("Func2 - Nome: " + funcionario2.getNome() + " | Salário: " + funcionario2.getSalario());

        System.out.println("\n=== Teste de CPF inválido ===");
        System.out.println("CPF antes da tentativa: " + funcionario1.getCpf());
        funcionario1.setCpf("12345");
        System.out.println("CPF depois da tentativa: " + funcionario1.getCpf());

        System.out.println("\n=== Teste de aumento salarial ===");
        System.out.println("Salário de func2 antes do aumento: " + funcionario2.getSalario());
        funcionario2.aplicarAumento(10);
        System.out.println("Salário de func2 depois do aumento de 10%: " + funcionario2.getSalario());

        System.out.println("\n=== Teste de aumento inválido (-200%) ===");
        System.out.println("Salário de func2 antes da tentativa: " + funcionario2.getSalario());
        funcionario2.aplicarAumento(-200);
        System.out.println("Salário de func2 depois da tentativa: " + funcionario2.getSalario());
    }
}
