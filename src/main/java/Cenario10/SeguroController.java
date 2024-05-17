package src.main.java.Cenario10;

import java.util.ArrayList;
import java.util.List;

public class SeguroController {
    private final List<Seguro> seguros;

    public SeguroController() {
        this.seguros = new ArrayList<>();
    }

    public void incluirSeguro(Seguro seguro) {
        seguros.add(seguro);
    }

    public Seguro localizarSeguro(String apolice) {
        for (Seguro seguro : seguros) {
            if (seguro.getApolice().equals(apolice)) {
                return seguro;
            }
        }
        return null;
    }

    public boolean excluirSeguro(String apolice) {
        Seguro seguro = localizarSeguro(apolice);
        if (seguro != null) {
            seguros.remove(seguro);
            return true;
        }
        return false;
    }

    public void excluirTodosSeguros() {
        seguros.clear();
    }

    public int quantidadeSeguros() {
        return seguros.size();
    }

    public List<Seguro> listarTodosSeguros() {
        return new ArrayList<>(seguros);
    }
}

