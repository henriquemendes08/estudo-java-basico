package academy.devdojo.maratona.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome Abaixo");
        String nome = input.nextLine();
        System.out.println("Qual sua idade?");
        int idade = input.nextInt();
        System.out.println("Digite M ou F para seu sexo");
        char sexo = input.next().charAt(0);
        System.out.println("----------------------------------------------------");
        System.out.println("Nome: " + nome + " Idade: " + idade + " Sexo: " + sexo);
    }
}
