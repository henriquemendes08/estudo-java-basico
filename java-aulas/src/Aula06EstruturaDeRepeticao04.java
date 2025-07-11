public class Aula06EstruturaDeRepeticao04 {
    public static void main(String[] args) {
        int valorCarro = 30000;
        for (int valorParcela = 1; valorParcela <= valorCarro; valorParcela++) {
            double parcela = valorCarro / valorParcela;
            if (parcela >= 1000){
                System.out.println("Parcela  " + valorParcela + "  R$  " + parcela);

            }else{
                break;
            }

        }
    }
}
