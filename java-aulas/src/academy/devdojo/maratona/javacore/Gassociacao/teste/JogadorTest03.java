package academy.devdojo.maratona.javacore.Gassociacao.teste;

import academy.devdojo.maratona.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratona.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pelé");
        Jogador jogador02 = new Jogador("Romero");
        Time time = new Time("Corinthians");
        Jogador[] jogadores = {jogador, jogador02};

        jogador.setTime(time);
        jogador02.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("------ Jogador -----");
        jogador.imprime();

        System.out.println("------ Time -----");
        time.imprime();
    }
}
