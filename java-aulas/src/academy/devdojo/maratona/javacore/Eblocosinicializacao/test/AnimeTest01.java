package academy.devdojo.maratona.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratona.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One piece");
        for (int episodio : anime.getEpisodios()) {
            System.out.println(episodio + " ");
        }

    }
}
