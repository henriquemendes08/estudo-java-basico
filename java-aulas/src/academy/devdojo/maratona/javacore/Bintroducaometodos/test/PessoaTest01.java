package academy.devdojo.maratona.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(0);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println("-------------------------------------");
        pessoa.imprimi();
    }
}
