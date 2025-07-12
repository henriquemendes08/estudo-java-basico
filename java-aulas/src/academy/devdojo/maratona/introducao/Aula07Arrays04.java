package academy.devdojo.maratona.introducao;

public class Aula07Arrays04 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5,6,7};
        int[] numeros3 = new int[] {1,2,3,4,5,6,7,8};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);

        }
        for(int i: numeros3){
            System.out.println(i);
        }
    }
}
