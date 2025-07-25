package academy.devdojo.maratona.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratona.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();



        carro1.nome = "Toyota";
        carro1.modelo = "Corrola";
        carro1.ano = 2022;

        carro1 = carro2;

        carro2.nome = "Honda";
        carro2.modelo = "Civic Touring";
        carro2.ano = 2023;


        System.out.println("Carro 1 = " + carro1.nome + "   " + carro1.modelo + "    " + carro1.ano);
        System.out.println("Carro 2 = " + carro2.nome + "   " + carro2.modelo + "    " + carro2.ano);


    }


}
