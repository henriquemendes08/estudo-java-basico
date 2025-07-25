package academy.devdojo.maratona.javacore.Bintroducaometodos.dominio;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Estudante;

public class ImpressoraEstudante {

    public void imprime(Estudante estudante){


        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);

        //passou a referencia do estudante.nome para gohan
        estudante.nome = "Gohan";
    }


}
