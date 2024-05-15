package src.main.java.Cenario07;

class Competencia {
    private String nome;
    private TipoCompetencia tipo;

    public Competencia(String nome, TipoCompetencia tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public TipoCompetencia getTipo() {
        return tipo;
    }
}

enum TipoCompetencia {
    NECESSARIA,
    COMPLEMENTAR
}