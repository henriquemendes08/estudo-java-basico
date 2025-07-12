package academy.devdojo.maratona.introducao;

public class Aula06EstruturaDeRepeticao05 {
        public static void main(String[] args) {
            double valorTotal = 30000;
            for(int parcela = (int) valorTotal;  parcela >= 1; parcela--) {
                double valorparcela = valorTotal / parcela;
                if(valorparcela < 1000){
                    continue;
            }
            System.out.println("Parcela " + parcela + "  R$  " + valorparcela);
        }

}
    }
