package academy.devdojo.maratona.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
       double result =  calculadora.divideDoisNumeros(20 , 0);
        System.out.println(result);
        System.out.println("--------------------");
        calculadora.imprimeDivisaoDoisNumeros02(85,0);
    }
}
