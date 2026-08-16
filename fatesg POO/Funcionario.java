public class Funcionario {
    String nome;
    double salarioBruto;
    int horasExtras;

    public double calcularValorHoraExtra() {
        double valorHoraNormal = salarioBruto / 220;
        return valorHoraNormal * 1.5;
    }

    public double calcularSalarioLiquido() {
        double totalHorasExtras = calcularValorHoraExtra() * horasExtras;
        double descontoINSS = salarioBruto * 0.10;

        return salarioBruto + totalHorasExtras - descontoINSS;
    }

    public void exibirContracheque() {
        System.out.println("Funcionario: " + nome);
        System.out.println("Salario bruto: R$ " + salarioBruto);
        System.out.println("Horas extras: " + horasExtras);
        System.out.println("Valor da hora extra: R$ " + calcularValorHoraExtra());
        System.out.println("Salario liquido: R$ " + calcularSalarioLiquido());
    }
}
