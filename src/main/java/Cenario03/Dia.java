import java.util.ArrayList;
import java.util.List;

public class Dia {
    private int diaMes;
    private Compromisso[] compromissos;

    public Dia(int diaMes) {
        this.diaMes = diaMes;
        this.compromissos = new Compromisso[24];
    }

    public void adicionarCompromisso(Compromisso comp) {
        compromissos[comp.getHora()] = comp;
    }

    public Compromisso consultarCompromisso(int hora) {
        return compromissos[hora];
    }

    public void excluirCompromisso(int hora) {
        compromissos[hora] = null;
    }

    public String[] listarCompromissos() {
        final List<String> listaCompromissos = new ArrayList<>();
        for (Compromisso comp : compromissos) {
            if (comp != null) {
                listaCompromissos.add(comp.toString());
            }
        }
        return listaCompromissos.toArray(new String[0]);
    }
}
