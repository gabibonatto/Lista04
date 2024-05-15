import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mes {
    private String nome;
    private int qtdeDias;
    private Dia[] dias;

    public Mes(int qtdeDias, String nome) {
        this.qtdeDias = qtdeDias;
        this.nome = nome;
        this.dias = new Dia[qtdeDias];
        for (int i = 0; i < qtdeDias; i++) {
            dias[i] = new Dia(i + 1);
        }
    }

    public void adicionarCompromisso(Compromisso comp, int diaMes) {
        dias[diaMes - 1].adicionarCompromisso(comp);
    }

    public String[] listarCompromissos(int diaMes) {
        return dias[diaMes - 1].listarCompromissos();
    }

    public String[] listarCompromissos() {
        List<String> listaCompromissos = new ArrayList<>();
        for (Dia dia : dias) {
            listaCompromissos.addAll(Arrays.asList(dia.listarCompromissos()));
        }
        return listaCompromissos.toArray(new String[0]);
    }

    public String getNome() {
        return nome;
    }

    public int getQtdeDias() {
        return qtdeDias;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQtdeDias(int qtdeDias) {
        this.qtdeDias = qtdeDias;
    }

    public Dia[] getDias() {
        return dias;
    }

    public void setDias(Dia[] dias) {
        this.dias = dias;
    }
}

