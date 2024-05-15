package src.main.java.Cenario07;

import src.main.java.Cenario07.Aluno.Titulacao;

class Professor extends Pessoa {
    private String curriculumLattes;
    private Titulacao titulacao;

    public Professor(String nome, String rg, String matricula, String curriculumLattes, Titulacao titulacao) {
        super(nome, rg, matricula);
        this.curriculumLattes = curriculumLattes;
        this.titulacao = titulacao;
    }

    public String getCurriculumLattes() {
        return curriculumLattes;
    }

    public Titulacao getTitulacao() {
        return titulacao;
    }
}