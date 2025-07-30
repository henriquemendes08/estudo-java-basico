package academy.devdojo.maratona.javacore.Gassociacao.teste;

import academy.devdojo.maratona.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratona.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Rique");
        Professor professor02 = new Professor("Saulo");

        Professor [] professores = {professor01 ,professor02};
        Escola escola = new Escola( "Manoel Bento", professores);
        escola.imprime();

    }
}
