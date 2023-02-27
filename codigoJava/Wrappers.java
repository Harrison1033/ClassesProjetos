package teste;

//Classe Wrappers
public class ClasseQuatro {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(20); //Leva do tipo Primitivo para Object
        imprimir(i);
        System.out.println("do Primitivo para Object: " + i);

        Double d = Double.valueOf(23.5); //Leva do tipo Primitivo para Object
        imprimir(d);
        System.out.println("do Primitivo para Object: " + d);

        int i1 = i.intValue(); //Leva de Object para o Primitivo
        System.out.println("do Object para Primitivo: " + i1);

        double d1 = d.doubleValue(); //Leva de Object para o Primitivo
        System.out.println("do Object para Primitivo: " + d1);

        Integer i2 = Integer.valueOf("30"); //Transforma do tipo String para Object
        System.out.println("Do String para Object: " + i2);

        Double d2 = Double.parseDouble("25.52"); //Transforma do tipo String para Primitivo
        System.out.println("do String para tipo Primitivo: " + d2);

        String bin = "0111"; //Transforma String Binário em Inteiro
        int i3 = Integer.parseInt(bin, 2);
        System.out.println("do String binário para Inteiro: " + i3);

        String bin1 = Integer.toBinaryString(7);//Transforma um número Inteiro em Binário
        System.out.println("do Inteiro para Binário: " + bin1);
    }

    private static void imprimir(Double d) {
    }

    private static void imprimir(Integer i) {
    }
}
