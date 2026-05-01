import java.util.Scanner;

public class atividade2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int repetirInfracao;
        int opcao;
        int totalInfracoes = 0;

        System.out.println("==================== Cadastro do Motorista ====================");
        System.out.println("Nome do motorista:");
        String nome = sc.next();

        System.out.println("Número da CNH:");
        int numeroCNH = sc.nextInt();

        System.out.println("Tempo de habilitação em anos:");
        int tempoHabilitacao = sc.nextInt();

        System.out.println("==================== Cadastro do Veículo ====================");
        System.out.println("Placa do veículo:");
        String placa = sc.next();

        System.out.println("Modelo do veículo:");
        String modelo = sc.next();

        System.out.println("Ano de fabricação:");
        int anoFabricacao = sc.nextInt();

        do {
            String tipoInfracao = "";
            String situacao = "";
            double valorMulta = 0;
            int pontos = 0;

            System.out.println("==================== MENU DE INFRAÇÕES ====================");
            System.out.println("1 - Excesso de velocidade");
            System.out.println("2 - Estacionamento (Área Azul)");
            System.out.println("3 - Álcool ao volante");
            System.out.println("Escolha uma opção:");
            opcao = sc.nextInt();

            while (opcao < 1 || opcao > 3) {
                System.out.println("Opção inválida. Digite novamente:");
                opcao = sc.nextInt();
            }

            switch (opcao) {

                case 1:
                    tipoInfracao = "Excesso de velocidade";

                    System.out.println("Digite a velocidade registrada:");
                    double velocidadeRegistrada = sc.nextDouble();

                    System.out.println("Digite o limite da via:");
                    double limiteDaVia = sc.nextDouble();

                    double velocidadeConsiderada;

                    if (velocidadeRegistrada <= 100) {
                        velocidadeConsiderada = velocidadeRegistrada - 7;
                    } else {
                        velocidadeConsiderada = velocidadeRegistrada - (velocidadeRegistrada * 0.07);
                    }

                    double percentual = ((velocidadeConsiderada - limiteDaVia) / limiteDaVia) * 100;

                    if (percentual <= 0) {
                        situacao = "Regular";
                        valorMulta = 0;
                        pontos = 0;
                    } else if (percentual <= 20) {
                        situacao = "Irregular - Infração média";
                        valorMulta = 130.16;
                        pontos = 4;
                    } else if (percentual <= 50) {
                        situacao = "Irregular - Infração grave";
                        valorMulta = 195.23;
                        pontos = 5;
                    } else {
                        situacao = "Irregular - Infração gravíssima";
                        valorMulta = 880.41;
                        pontos = 7;
                    }
                    break;

                case 2:
                    tipoInfracao = "Estacionamento - Área Azul";

                    System.out.println("Possui ativação da Área Azul? 1-Sim / 2-Não");
                    int ativacao = sc.nextInt();

                    while (ativacao != 1 && ativacao != 2) {
                        System.out.println("Opção inválida. Digite 1-Sim ou 2-Não:");
                        ativacao = sc.nextInt();
                    }

                    if (ativacao == 2) {
                        situacao = "Irregular - Infração grave";
                        valorMulta = 195.23;
                        pontos = 5;
                    } else {
                        System.out.println("Digite o tempo estacionado em minutos:");
                        int minutos = sc.nextInt();

                        int excedido = minutos - 120;

                        if (excedido <= 0) {
                            situacao = "Regular";
                            valorMulta = 0;
                            pontos = 0;
                        } else if (excedido <= 30) {
                            situacao = "Irregular - Infração leve";
                            valorMulta = 88.38;
                            pontos = 3;
                        } else if (excedido <= 60) {
                            situacao = "Irregular - Infração média";
                            valorMulta = 130.16;
                            pontos = 4;
                        } else {
                            situacao = "Irregular - Infração grave";
                            valorMulta = 195.23;
                            pontos = 5;
                        }
                    }
                    break;

                case 3:
                    tipoInfracao = "Álcool ao volante";

                    System.out.println("O motorista recusou o teste? 1-Sim / 2-Não");
                    int recusou = sc.nextInt();

                    while (recusou != 1 && recusou != 2) {
                        System.out.println("Opção inválida. Digite 1-Sim ou 2-Não:");
                        recusou = sc.nextInt();
                    }

                    if (recusou == 1) {
                        situacao = "Irregular - Infração gravíssima";
                        valorMulta = 2934.70;
                        pontos = 7;
                    } else {
                        System.out.println("Digite a quantidade de álcool em mg/L:");
                        double alcool = sc.nextDouble();

                        if (alcool <= 0.04) {
                            situacao = "Regular";
                            valorMulta = 0;
                            pontos = 0;
                        } else if (alcool <= 0.33) {
                            situacao = "Irregular - Infração gravíssima";
                            valorMulta = 2934.70;
                            pontos = 7;
                        } else {
                            situacao = "Irregular - Crime de trânsito";
                            valorMulta = 2934.70;
                            pontos = 7;
                        }
                    }
                    break;
            }

            totalInfracoes++;

            System.out.println("==================== RELATÓRIO ====================");
            System.out.println("Motorista: " + nome);
            System.out.println("CNH: " + numeroCNH);
            System.out.println("Tempo de habilitação: " + tempoHabilitacao + " anos");
            System.out.println("Placa: " + placa);
            System.out.println("Modelo: " + modelo);
            System.out.println("Ano de fabricação: " + anoFabricacao);
            System.out.println("Tipo de infração: " + tipoInfracao);
            System.out.println("Valor da multa: R$ " + valorMulta);
            System.out.println("Pontuação: " + pontos);
            System.out.println("Situação: " + situacao);

            System.out.println("Deseja registrar outra infração? (1-Sim / 2-Não)");
            repetirInfracao = sc.nextInt();

        } while (repetirInfracao == 1);

        System.out.println("==================== SAÍDA FINAL ====================");

        for (int i = 1; i <= totalInfracoes; i++) {
            System.out.println("Infração registrada número: " + i);
        }

        System.out.println("Total de infrações registradas: " + totalInfracoes);

        sc.close();
    }
}