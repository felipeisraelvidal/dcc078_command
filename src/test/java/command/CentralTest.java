package command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CentralTest {

    Central central;
    Chamado chamado;

    @BeforeEach
    void setUp() {
        central = new Central();
        chamado = new Chamado (1,"Solicitar acesso" );
    }

    @Test
    void deveAbrirChamado() {
        Tarefa aberturaChamado = new AberturaChamadoTarefa(chamado);
        central.executarTarefa(aberturaChamado);

        assertEquals("Chamado aberto", chamado.getSituacao());
    }

    @Test
    void deveFecharChamado() {
        Tarefa fechamentoChamado = new FechamentoChamadoTarefa(chamado);
        central.executarTarefa(fechamentoChamado);

        assertEquals("Chamado fechado", chamado.getSituacao());
    }

    @Test
    void deveCancelarFechamentoChamado() {
        Tarefa aberturaChamado = new AberturaChamadoTarefa(chamado);
        Tarefa fechamentoChamado = new FechamentoChamadoTarefa(chamado);

        central.executarTarefa(aberturaChamado);
        central.executarTarefa(fechamentoChamado);

        central.cancelarUltimaTarefa();

        assertEquals("Chamado aberto", chamado.getSituacao());
    }

}
