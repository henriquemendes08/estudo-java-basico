package academy.devdojo.maratona.javacore.Fmodificarstatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    // Bloco de inicialização é executado quando a JVM  carregar a classe
    // 1 -  Alocado espaço  em memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores defalut ou que for passada
    // 3 - Bloco de inicialização é executado
    //4 -Construtor é executado
    static{
        System.out.println("Dentro do bloco");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }
    static {
        System.out.println("Dentro do bloco 2");
    }
    {
        System.out.println("Dentro do bloco não estatico ");
    }


    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");

        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }


    public int[] getEpisodios() {
        return episodios;
    }


}
