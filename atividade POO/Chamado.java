package chamados;

public class Chamado {

    public int id;
    public String titulo;
    public String descricao;
    public StatusChamado status;
    public Prioridade prioridade;
    public Usuario solicitante;

    public Chamado(int id, String titulo, String descricao, Prioridade prioridade, Usuario solicitante) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.solicitante = solicitante;
        this.status = StatusChamado.ABERTO;
    }

    @Override
    public String toString() {
        return "#" + id + " - " + titulo + " | " + status + " | " + prioridade + " | " + solicitante.nome;
    }
}
