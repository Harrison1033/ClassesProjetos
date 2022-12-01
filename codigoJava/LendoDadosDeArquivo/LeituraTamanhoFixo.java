package estudando.classe1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main  {
    public static void main(String[] args) throws IOException {
       try (InputStream is = new FileInputStream("C:\\Users\\computer\\Desktop\\entrada.txt")){
           byte[] buffer = new byte[1024];
           int bitesLidos = is.read(buffer);
           String s = new String(buffer,0,bitesLidos);
           System.out.println(s);
           System.out.println(s.length());
       }
    }
}
