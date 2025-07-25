package academy.devdojo.maratona.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int  idade;
    private double[] salarios;
    private  double media;

    public void imprimirDados(){
        System.out.println(this.nome);

        for(double salario :salarios){
            System.out.println(salario + "   ");
        }
        System.out.println(this.idade);
    }
    
    public void mediaSalario(){
        if (salarios == null){
            return;
        }
        double media  = 0;
        for (double salarioTotal: salarios) {
            media += salarioTotal;
        }
        double mediaTotal  = media / salarios.length;
        System.out.println("A média salarial é: " + media);

    }

    public double getMedia() {
        return media;
    }



    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
