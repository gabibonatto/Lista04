package src.main.java.Cenario07;

class Aluno extends Pessoa {
    private int anoIngresso;
    private String curso;
    private String turno;
    private Situacao situacao;

    public Aluno(String nome, String rg, String matricula, int anoIngresso, String curso, String turno) {
        super(nome, rg, matricula);
        this.anoIngresso = anoIngresso;
        this.curso = curso;
        this.turno = turno;
        this.situacao = Situacao.PENDENTE; 
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public String getCurso() {
        return curso;
    }

    public String getTurno() {
        return turno;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    enum Titulacao {
        GRADUACAO,
        ESPECIALIZACAO,
        MESTRADO,
        DOUTORADO
    }
    
    enum Situacao {
        APROVADO,
        REPROVADO,
        PENDENTE, ATINGIDA
    }

    public Situacao getSituacaoCompetencia(Competencia competencia) {

        throw new UnsupportedOperationException("Unimplemented method 'getSituacaoCompetencia'");
    }
}
