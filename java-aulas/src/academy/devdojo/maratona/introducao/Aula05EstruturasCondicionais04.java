package academy.devdojo.maratona.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 70000;

        if (salarioAnual <= 34712  ){
          double salarioResultado = salarioAnual * 9.70 / 100;
        System.out.println("O resultado final é " + salarioResultado);
        } else if (salarioAnual <= 68507){
            double  salarioResultado = salarioAnual * 33.35 / 100;
            System.out.println("O resultado final é " + salarioResultado);
    }else{
            double  salarioResultado = salarioAnual * 49.50 / 100;
            System.out.println("O resultado final é " + salarioResultado);
        }
}
}
