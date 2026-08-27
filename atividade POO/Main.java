package chamados;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Chamado> chamados = new ArrayList<>();

        Usuario matheus = new Usuario(1, "Matheus", "matheus@empresa.com");
        Usuario ana = new Usuario(2, "Ana", "ana@empresa.com");

        chamados.add(new Chamado(1, "Impressora nao funciona",
                "A impressora do setor financeiro nao esta imprimindo", Prioridade.MEDIA, matheus));

        chamados.add(new Chamado(2, "Sistema Tasy lento",
                "Usuarios relatam lentidao ao acessar o sistema Tasy", Prioridade.ALTA, ana));

        System.out.println("=== Chamados abertos ===");
        for (Chamado c : chamados) {
            System.out.println(c);
        }

        chamados.get(0).status = StatusChamado.EM_ANDAMENTO;
        chamados.get(1).status = StatusChamado.FECHADO;

        System.out.println("\n=== Apos atualizar status ===");
        for (Chamado c : chamados) {
            System.out.println(c);
        }
    }
}
