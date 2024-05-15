package src.main.java.Cenario07;

import java.util.ArrayList;
import java.util.List;

class Disciplina {
    
    private String nome;
    private String identificador;
    private String curriculo;
    private Professor professor;
    private List<Aluno> alunos;
    private List<Competencia> competencias;

    public Disciplina(String nome, String identificador, String curriculo, Professor professor) {
        this.nome = nome;
        this.identificador = identificador;
        this.curriculo = curriculo;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        this.competencias = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public void adicionarCompetencia(Competencia competencia) {
        competencias.add(competencia);
    }

    public void removerCompetencia(Competencia competencia) {
        competencias.remove(competencia);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Competencia> getCompetencias() {
        return competencias;
    }

    public String getNome() {
        return nome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public Professor getProfessor() {
        return professor;
    }
}

