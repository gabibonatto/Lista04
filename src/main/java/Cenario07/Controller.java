package src.main.java.Cenario07;

import src.main.java.Cenario07.Aluno.Situacao;

class Controller {

    public Situacao avaliarSituacaoAluno(Disciplina disciplina, Aluno aluno) {
        int necessariasAtingidas = 0;
        int complementaresAtingidas = 0;

        for (Competencia competencia : disciplina.getCompetencias()) {
            if (aluno.getSituacaoCompetencia(competencia) == Situacao.ATINGIDA) {
                if (competencia.getTipo() == TipoCompetencia.NECESSARIA) {
                    necessariasAtingidas++;
                } else {
                    complementaresAtingidas++;
                }
            }
        }

        if (necessariasAtingidas == disciplina.getCompetencias().size() &&
                complementaresAtingidas >= disciplina.getCompetencias().size() / 2) {
            return Situacao.APROVADO;
        } else if (necessariasAtingidas < disciplina.getCompetencias().size() ||
                complementaresAtingidas < disciplina.getCompetencias().size() / 2) {
            return Situacao.REPROVADO;
        } else {
            return Situacao.PENDENTE;
        }
    }
}
