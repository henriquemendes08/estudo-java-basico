public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double  salario = 6000;
        String menssagemDoar = " Eu vou doar 500 reais ";
        String menssagemNaoDoar = " Eu nao tenho condições de  doar 500 reais ";
        String resultado  = salario <= 6000 ? menssagemDoar : menssagemNaoDoar;

        System.out.println(resultado);
    }
}
