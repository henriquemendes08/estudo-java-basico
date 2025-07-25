package academy.devdojo.maratona.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Henrique");
        funcionario.setIdade(17);
        funcionario.setSalarios(new double[]{1200 ,900, 1500});

        funcionario.imprimirDados();
        System.out.println("Media" + funcionario.getMedia());
    }
}
