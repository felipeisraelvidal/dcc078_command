package command;

public class AberturaChamadoTarefa implements Tarefa {

    private Chamado chamado;

    public AberturaChamadoTarefa(Chamado chamado) {
        this.chamado = chamado;
    }

    public void executar() {
        this.chamado.abrirChamado();
    }

    public void cancelar() {
        this.chamado.fecharChamado();
    }
}
