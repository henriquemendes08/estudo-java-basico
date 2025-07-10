public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutirizadoComprarBebida = idade >= 18;
        if (isAutirizadoComprarBebida != false ) {
            System.out.println("Autorizado a comprar");
        }else{
            System.out.println("Não autorizado a comprar");
        }

        boolean c  = false;
        if (c == false){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }



    }
}