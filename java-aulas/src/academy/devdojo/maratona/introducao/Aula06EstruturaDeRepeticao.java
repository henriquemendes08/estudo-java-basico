package academy.devdojo.maratona.introducao;

public class Aula06EstruturaDeRepeticao {
    public static void main(String[] args){
        int count = 0;

        while(count < 5){
            count ++;
            System.out.println(count);
        }
        count = 0;
        do {
            System.out.println("dentro do do-while" +  ++count);
        }while (count < 10);

        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}
