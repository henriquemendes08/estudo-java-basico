package academy.devdojo.maratona.javacore.Gassociacao.dominio;

public class Jogador {
    private Time time;
    private String nome;
    public void imprime(){
        System.out.println(this.nome);
        if (time != null){
            System.out.println(time.getNome());

        }
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }



    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
