package academy.devdojo.maratona.javacore.Hhreanca.test;

import academy.devdojo.maratona.javacore.Hhreanca.dominio.Endereco;
import academy.devdojo.maratona.javacore.Hhreanca.dominio.Funcionario;
import academy.devdojo.maratona.javacore.Hhreanca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3 ");
        endereco.setCep("12345-949");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Henrique");
        pessoa.setCpf("111111112");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Vini");
        funcionario.setCpf("111111112");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("-----------------------------");
        funcionario.imprime();


    }
}
