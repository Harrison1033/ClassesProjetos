public class MainUm {
    public static void main(String[] args) {
        String sim = "Pago";
        String nao = "Não Pago";
        double valor = 3000;
        String resultado = valor > 5000 ? sim : nao;
        System.out.println(resultado);
    }
}