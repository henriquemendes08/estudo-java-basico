package academy.devdojo.maratona.javacore.Fmodificarstatico.test;

import academy.devdojo.maratona.javacore.Fmodificarstatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);
        Carro c1 = new Carro("BMW" , 280);
        Carro c2 = new Carro("Mercedes" , 270);
        Carro c3 = new Carro("Evoque", 290);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
