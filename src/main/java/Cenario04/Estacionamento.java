package src.main.java.Cenario04;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    private static final int MAX_VAGAS = 10;
    private List<Veiculo> vagas;

    public Estacionamento() {
        this.vagas = new ArrayList<>();
    }

    public boolean entrar(Veiculo veiculo) {
        if (vagas.size() < MAX_VAGAS) {
            vagas.add(veiculo);
            return true;
        } else {
            return false;
        }
    }

    public boolean sair(String placa) {
        for (Veiculo veiculo : vagas) {
            if (veiculo.getPlaca().equals(placa)) {
                vagas.remove(veiculo);
                return true;
            }
        }
        return false;
    }

    public int getTotalVagas() {
        return MAX_VAGAS;
    }

    public int getVagasDisponiveis() {
        return MAX_VAGAS - vagas.size();
    }

    public int getVagasOcupadas() {
        return vagas.size();
    }
}
