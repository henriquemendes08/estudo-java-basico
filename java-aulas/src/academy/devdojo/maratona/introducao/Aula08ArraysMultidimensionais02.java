package academy.devdojo.maratona.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5};
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[6];

        int[][] arrayInt2 = {{0, 1}, {1, 1, 2}, {1, 2, 3, 4, 5, 6, 7}};


        for (int[] arrayBase : arrayInt2) {
            System.out.print("\n-----------");
            for (int num : arrayBase) {
                System.out.println(num + " ");
            }
        }
    }
}
