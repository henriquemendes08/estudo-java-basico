package academy.devdojo.maratona.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTeclado02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo ao jogo de perguntas!");
        System.out.println("Digite sua pergunta e eu responderei:");
        String pergunta = input.next();
        if (pergunta.charAt(0) ==  ' '){
            System.out.println("Sim");
        }else{
            System.out.println("Não");
        }
    }
}
