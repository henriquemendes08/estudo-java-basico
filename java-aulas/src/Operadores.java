public class Operadores {

    // sout é o atalho para escrever System.out.println no IntelliJ

    public static void main(String[] args) {

        // 🔤 CONCATENAÇÃO DE STRINGS
        String nomeCompleto = "Linguagem " + "Java";
        System.out.println(nomeCompleto); // Linguagem Java

        // 🧮 CONCATENAÇÃO COM NÚMEROS (tudo vira texto)
        System.out.println("1" + "1"); // 11
        System.out.println("1" + 1);   // 11

        // ➕ INCREMENTO E DECREMENTO
        int numero = 1;
        System.out.println(numero++); // imprime 1, depois incrementa para 2
        System.out.println(numero--); // imprime 2, depois decrementa para 1

        // ❗ NEGAÇÃO LÓGICA
        boolean verdadeiro = true;
        System.out.println(!verdadeiro); // false

        // 🤔 OPERADOR TERNÁRIO (condição simples)
        int a = 5;
        int b = 6;
        int resultadoTernario = (a == b) ? 1 : 0;
        System.out.println(resultadoTernario); // 0 (pois 5 != 6)

        // 🔁 CONDICIONAL IF/ELSE TRADICIONAL
        String resultado;
        if (a == b) {
            resultado = "verdadeiro";
        } else {
            resultado = "falso";
        }
        System.out.println(resultado); // falso

        // ⚖️ OPERADORES RELACIONAIS
        int primeiroNum = 1;
        int segundoNum = 2;

        boolean igual = primeiroNum == segundoNum;
        boolean diferente = primeiroNum != segundoNum;
        boolean menorOuIgual = primeiroNum <= segundoNum;
        boolean maiorOuIgual = primeiroNum >= segundoNum;

        System.out.println("Número 1 é igual ao número 2? : " + igual);
        System.out.println("Número 1 é diferente do número 2? : " + diferente);
        System.out.println("Número 1 é menor ou igual ao número 2? : " + menorOuIgual);
        System.out.println("Número 1 é maior ou igual ao número 2? : " + maiorOuIgual);

        // 🧠 COMPARANDO STRINGS (atenção ao uso de referências)
        String nomeUm = "Mendes";
        String nomeDois = "Mendes";

        System.out.println(nomeUm == nomeDois);           // true (internamente é o mesmo objeto por otimização do Java)
        System.out.println(nomeUm.equals(nomeDois));      // true (compara o conteúdo)

        // 🔀 OPERADORES LÓGICOS (AND / OR)
        boolean condicao1 = false;
        boolean condicao2 = true;

        // E lógico (AND): só entra se as duas forem verdadeiras
        if (condicao1 && (7 > 4)) {
            System.out.println("As duas condições são verdadeiras");
        }

        // OU lógico (OR): entra se pelo menos uma for verdadeira
        if (condicao1 || condicao2) {
            System.out.println("Pelo menos uma das condições é verdadeira");
        }
    }
}
