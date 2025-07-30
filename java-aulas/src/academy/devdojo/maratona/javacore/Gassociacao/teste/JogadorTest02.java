package academy.devdojo.maratona.javacore.Gassociacao.teste;

import academy.devdojo.maratona.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratona.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pelé");

        Time time = new Time("Corinthians");
        jogador01.setTime((time));
        jogador01.imprime();

    }
}
