import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ano {
    private int ano;
    private boolean bissexto;
    private Mes[] meses;

    public Ano(int ano, boolean bissexto) {
        this.ano = ano;
        this.bissexto = bissexto;
        this.meses = new Mes[12];
    }

    public void adicionarMes(Mes mes) {
        meses[mes.getQtdeDias() - 1] = mes;
    }

    public void excluirCompromisso(String compromisso, int nomeMes, int hora) {
        for (Mes mes : meses) {
            if (mes.getNome().equalsIgnoreCase(compromisso)) {
                mes.listarCompromissos(nomeMes)[hora - 1] = null;
                break;
            }
        }
    }

    public String[] listarCompromissos(String nomeMes) {
        for (Mes mes : meses) {
            if (mes.getNome().equalsIgnoreCase(nomeMes)) {
                return mes.listarCompromissos();
            }
        }
        return new String[0];
    }

    public String[] listarCompromissos() {
        List<String> listaCompromissos = new ArrayList<>();
        for (Mes mes : meses) {
            listaCompromissos.addAll(Arrays.asList(mes.listarCompromissos()));
        }
        return listaCompromissos.toArray(new String[0]);
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isBissexto() {
        return bissexto;
    }

    public void setBissexto(boolean bissexto) {
        this.bissexto = bissexto;
    }

    public Mes[] getMeses() {
        return meses;
    }

    public void setMeses(Mes[] meses) {
        this.meses = meses;
    }

    public void excluirCompromisso(Compromisso compromisso, String nomeMes, int diaMes) {
        throw new UnsupportedOperationException("Unimplemented method 'excluirCompromisso'");
    }

    public String[] listarCompromissosDia(String nomeMes, int diaMes) {
        throw new UnsupportedOperationException("Unimplemented method 'listarCompromissosDia'");
    }
}