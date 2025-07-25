package academy.devdojo.maratona.javacore.Csobrecargametodos.test;

import academy.devdojo.maratona.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime  = new Anime();
        anime.init("Naruto","Tv",12,"Ação" );


        anime.imprime();
    }
}
