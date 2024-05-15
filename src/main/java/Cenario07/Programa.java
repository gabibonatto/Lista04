package src.main.java.Cenario07;

import src.main.java.Cenario07.Aluno.Situacao;
import src.main.java.Cenario07.Aluno.Titulacao;

public class Programa {
        public static void main(String[] args) {
        final Professor professor = new Professor("João", "123456", "P001", "http://lattes.com/joao", Titulacao.DOUTORADO);

        Aluno aluno1 = new Aluno("Maria", "654321", "A001", 2020, "Engenharia", "Manhã");
        Aluno aluno2 = new Aluno("Pedro", "789123", "A002", 2021, "Medicina", "Tarde");

        Disciplina disciplina = new Disciplina("Programação", "PROG001", "Ciência da Computação", professor);
        disciplina.adicionarAluno(aluno1);
        disciplina.adicionarAluno(aluno2);

        disciplina.adicionarCompetencia(new Competencia("Java", TipoCompetencia.NECESSARIA));
        disciplina.adicionarCompetencia(new Competencia("Algoritmos", TipoCompetencia.NECESSARIA));
        disciplina.adicionarCompetencia(new Competencia("HTML", TipoCompetencia.COMPLEMENTAR));
        disciplina.adicionarCompetencia(new Competencia("CSS", TipoCompetencia.COMPLEMENTAR));

        Controller controller = new Controller();
        Situacao situacaoAluno1 = controller.avaliarSituacaoAluno(disciplina, aluno1);
        Situacao situacaoAluno2 = controller.avaliarSituacaoAluno(disciplina, aluno2);

        System.out.println("Situação do Aluno " + aluno1.getNome() + ": " + situacaoAluno1);
        System.out.println("Situação do Aluno " + aluno2.getNome() + ": " + situacaoAluno2);
    }
}