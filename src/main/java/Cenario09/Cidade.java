package src.main.java.Cenario09;

public class Cidade {
    private String nome;
    private String UF;

    public Cidade(String nome, String UF) {
        this.nome = nome;
        this.UF = UF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String uF) {
        UF = uF;
    }

}
