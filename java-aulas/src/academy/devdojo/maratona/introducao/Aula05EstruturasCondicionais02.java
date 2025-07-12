package academy.devdojo.maratona.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args){
        // idade < 15 categoria infatil
        // idade >= 15 && idade < 18 categoria juvenil
        // idadee >=18 categoria adulto
        int idade = 17;
        String categoria;
//        if(idade < 15){
//            categoria = ("Categoria infatil");
//        }else if( idade >= 15 && idade < 18){
//            categoria = ("Categoria Juvenil");
//        }else{
//            categoria = ("Categoria adulta");
//        }
//
        categoria = idade < 15 ? "Categoria infatil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria adulta";
        System.out.println(categoria);
    }
}
