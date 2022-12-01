package estudando.classe1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class QuintaClasse  {
    public static void main(String[] args) throws IOException {
       try (InputStream is = new FileInputStream("C:\\Users\\aguia\\Desktop\\entrada.txt")){
           byte[] buffer = new byte[8];
           String s = "";
           int bitesLidos;
           while ((bitesLidos = is.read(buffer)) > -1){
               s += new String(buffer,0,bitesLidos);
           }
           System.out.println(s);
           System.out.println(s.length());
       }
    }
}