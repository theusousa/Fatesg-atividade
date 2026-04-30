import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tentativa = 0;
        boolean logado = false;

        String resposta;

        while (tentativa < 3 && !logado) {
            tentativa++;

            System.out.print("Digite o usuário: ");
            String user = sc.next();

            System.out.print("Digite a senha: ");
            String password = sc.next();

            if (user.equals("admin") && password.equals("1234")) {
                logado = true;

                do {
                    System.out.println("\n==================== MENU ====================");
                    System.out.println("1 - Controle de atividades realizadas");
                    System.out.println("2 - Análise de números informados");
                    System.out.println("3 - Encerrar sistema");
                    System.out.print("Escolha uma opção: ");

                    String opcao = sc.next();

                    if (opcao.equals("1")) {

                        System.out.print("Informe a quantidade de dias: ");
                        int dias = sc.nextInt();

                        int totalAtividades = 0;
                        int diasMaiorQueDez = 0;

                        for (int i = 1; i <= dias; i++) {
                            System.out.print("Informe as atividades do dia " + i + ": ");
                            int atividades = sc.nextInt();

                            totalAtividades += atividades;

                            if (atividades > 10) {
                                diasMaiorQueDez++;
                            }
                        }

                        double media = (double) totalAtividades / dias;

                        System.out.println("Total de atividades: " + totalAtividades);
                        System.out.println("Média diária: " + media);
                        System.out.println("Dias com mais de 10 atividades: " + diasMaiorQueDez);

                    } else if (opcao.equals("2")) {

                        int somaPares = 0;
                        int quantidadeImpares = 0;
                        int numero = 0;

                        while (numero >= 0) {
                            System.out.print("Digite um número (negativo para encerrar): ");
                            numero = sc.nextInt();

                            if (numero >= 0) {
                                if (numero % 2 == 0) {
                                    somaPares += numero;
                                } else {
                                    quantidadeImpares++;
                                }
                            }
                        }

                        System.out.println("Soma dos números pares: " + somaPares);
                        System.out.println("Quantidade de números ímpares: " + quantidadeImpares);

                    } else if (opcao.equals("3")) {

                        System.out.println("Sistema encerrado.");

                    } else {
                        System.out.println("Opção inválida.");
                    }

                    System.out.print("Deseja continuar? (sim/nao): ");
                    resposta = sc.next();

                } while (resposta.equalsIgnoreCase("sim"));

            } else if (tentativa < 3) {
                System.out.println("Usuário ou senha incorretos.\n");
            } else {
                System.out.println("Acesso bloqueado.");
            }
        }

        sc.close();
    }
}