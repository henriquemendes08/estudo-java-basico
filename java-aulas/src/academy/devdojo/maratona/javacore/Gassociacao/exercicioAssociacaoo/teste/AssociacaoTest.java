package academy.devdojo.maratona.javacore.Gassociacao.exercicioAssociacaoo.teste;

import academy.devdojo.maratona.javacore.Gassociacao.exercicioAssociacaoo.domain.Aluno;
import academy.devdojo.maratona.javacore.Gassociacao.exercicioAssociacaoo.domain.Local;
import academy.devdojo.maratona.javacore.Gassociacao.exercicioAssociacaoo.domain.Professor;
import academy.devdojo.maratona.javacore.Gassociacao.exercicioAssociacaoo.domain.Seminario;


public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Henrique", 17);
        Professor professor = new Professor("Rodrigo ", "Dev");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Como se tornar um Dev java", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();
    }
}
