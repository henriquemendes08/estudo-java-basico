package academy.devdojo.maratona.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[2][3];
        dias[0][0] = 12;
        dias[0][1] = 43;
        dias[0][2] = 76;

        dias[1][0] = 1;
        dias[1][1] = 2;
        dias[1][2] = 9;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("--------------------------------------------------------");
        for(int[] arrBase: dias){
            for (int num: arrBase){
                System.out.println(num);
            }
        }
    }
}
