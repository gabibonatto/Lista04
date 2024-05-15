import java.util.ArrayList;
import java.util.List;

public class ReservaController {
    private List<Reserva> reservas;

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public ReservaController() {
        this.reservas = new ArrayList<>();
    }
}

