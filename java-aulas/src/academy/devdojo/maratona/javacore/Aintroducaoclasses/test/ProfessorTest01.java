package academy.devdojo.maratona.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratona.javacore.Aintroducaoclasses.dominio.Professor;
// Coesão: manter cada classe ou método focado em uma única tarefa.
// Coesão significa que cada parte do código deve fazer só uma coisa bem feita.

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 30;
        professor.sexo = 'M';

        System.out.println(professor.nome + "     "  + professor.idade  + "     " + professor.sexo);
    }
}
