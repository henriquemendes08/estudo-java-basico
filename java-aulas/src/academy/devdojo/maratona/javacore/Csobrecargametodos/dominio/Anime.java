package academy.devdojo.maratona.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    public Anime(){

    }

    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;

    }
    public void init(String nome, String tipo, int episodios,String genero){
        this.init(nome,tipo,episodios);
        this.genero = genero;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.episodios);
        System.out.println(this.tipo);
        System.out.println(this.genero);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setTipo(String tipo ){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setEspisodios(int espisodios){
        this.episodios = espisodios;
    }

    public int getEspisodios(){
        return  this.episodios;
    }
}
