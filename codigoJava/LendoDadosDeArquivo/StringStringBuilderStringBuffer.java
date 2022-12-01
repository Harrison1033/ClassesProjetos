package estudando.classe1;
//String,StringBuilder,StringBuffer(Tempo de complilação)
public class Main  {
    public static void main(String[] args){
      long inicio = System.currentTimeMillis();
      contactString(10_000);
      long fim = System.currentTimeMillis();
        System.out.println("Tempo para String: "+(fim - inicio)+" ms");

        inicio = System.currentTimeMillis();
        contactStringBuilder(10_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo para StringBuilder: " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        contactStringBuffer(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo para StringBuffer: " + (fim - inicio) + " ms");
    }
    private static void contactString(int tmamanho){//Pior desempenho com grandes strings
        String texto = "";
        for (int i = 0; i < tmamanho; i++){
            texto += i;
        }
    }
    private static void contactStringBuilder(int tamanho){//Melhor desempenho com grandes strings
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++){
            sb.append(i);
        }
    }
    private static void contactStringBuffer(int tamanho){//Desempenho razoável com grandes strings
        StringBuffer sbf = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho;i++){
            sbf.append(i);
        }
    }
}
