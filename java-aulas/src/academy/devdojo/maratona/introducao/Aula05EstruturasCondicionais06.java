package academy.devdojo.maratona.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        byte dia = 5;
        switch (dia) {
            case 1:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil");

            case 7:
                System.out.println("FDS");
                break;
        }
    }
}
