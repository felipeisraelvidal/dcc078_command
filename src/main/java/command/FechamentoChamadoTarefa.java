package command;

public class FechamentoChamadoTarefa implements Tarefa {

    private Chamado chamado;

    public FechamentoChamadoTarefa(Chamado chamado) {
        this.chamado = chamado;
    }

    public void executar() {
        this.chamado.fecharChamado();
    }

    public void cancelar() {
        this.chamado.abrirChamado();
    }
}
