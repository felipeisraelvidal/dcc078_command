package command;

public class Chamado {

    private int id;
    private String descricao;
    private String situacao;

    public Chamado(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirChamado() {
        this.situacao = "Chamado aberto";
    }

    public void fecharChamado() {
        this.situacao = "Chamado fechado";
    }
}

