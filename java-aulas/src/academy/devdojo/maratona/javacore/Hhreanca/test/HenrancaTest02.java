package academy.devdojo.maratona.javacore.Hhreanca.test;

import academy.devdojo.maratona.javacore.Hhreanca.dominio.Funcionario;
// 0 - Bloco de inicialização estático da superclasse é executado quando a JVM carrega a classe pai
// 1 - Bloco de inicialização estático da subclasse é executado quando a JVM carrega a classe filha

// 2 - Alocado espaço em memória para o objeto da superclasse
// 3 - Cada atributo da superclasse é criado e inicializado com valores default ou o que for passado
// 4 - Blocos de inicialização (não estáticos) da superclasse são executados na ordem em que aparecem
// 5 - Construtor da superclasse é executado

// 6 - Alocado espaço em memória para o objeto da subclasse
// 7 - Cada atributo da subclasse é criado e inicializado com valores default ou o que for passado
// 8 - Blocos de inicialização (não estáticos)

public class HenrancaTest02 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Rique");
    }
}
