import java.util.ArrayList;
import java.util.List;

public class EventoController {
    private List<Evento> eventos;

    public EventoController() {
        this.eventos = new ArrayList<>();
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

}
