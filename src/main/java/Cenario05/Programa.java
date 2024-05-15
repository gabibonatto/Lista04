import java.util.Scanner;

public class Programa {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        EventoController eventoController = new EventoController();
        ReservaController reservaController = new ReservaController();


        exibirMenu(eventoController, reservaController);
    }

    private static void exibirMenu(EventoController eventoController, ReservaController reservaController) {

    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        Programa.scanner = scanner;
    }
}
