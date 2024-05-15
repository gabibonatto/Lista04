package src.main.java.Cenario06;

import java.util.List;

class Comissario extends Tripulacao {
    private List<String> idiomas;

    public Comissario(String nome, String rg, String identificacaoAeronautica, String matriculaFuncionario, List<String> idiomas) {
        super(nome, rg, identificacaoAeronautica, matriculaFuncionario);
        this.idiomas = idiomas;
    }

    public List<String> getIdiomas() {
        return idiomas;
    }
}
