package academy.devdojo.maratona.javacore.Dconstrutores.dominio;



public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;
    public Anime(String nome, String tipo, int episodios,String genero){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios,String genero ,String estudio){
        this(nome, tipo , episodios, genero);  // this() chama outro construtor da mesma classe e deve ser a primeira linha do construtor, tem que ser na 1 linha!!!!!!
        // detalhe so da para chamar o this(); quando esta dentro de um outro contrutor, se no caso nao da para chamar um contrutor em um metodo
        this.estudio = estudio;
    }

    public Anime(){
        System.out.println("Dentro do construtor");
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
