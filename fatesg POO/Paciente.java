public class Paciente {
    String nome;
    double peso;
    double altura;
    int idade;

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String classificarIMC() {
        double imc = calcularIMC();

        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    public void exibirFicha() {
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Idade: " + idade);
        System.out.println("IMC: " + calcularIMC());
        System.out.println("Classificacao: " + classificarIMC());
    }
}
