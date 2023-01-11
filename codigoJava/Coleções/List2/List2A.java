package teste;
//List2A
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
      ClasseDois s1 = new ClasseDois("1ACB1","iFome");
      ClasseDois s2 = new ClasseDois("22222","Pixel");
      ClasseDois s3 = new ClasseDois("33333","Samsung");
      List<ClasseDois> smartphones = new ArrayList<>(6);
      smartphones.add(s1);
      smartphones.add(s2);
      smartphones.add(0,s3);//Coloca o s3 na posição 0
      for (ClasseDois smartphone:smartphones){
          System.out.println(smartphone);
      }
      ClasseDois s4 = new ClasseDois("22222","Pixel");
        System.out.println(smartphones.contains(s4));//Para saber se exeste valor igual(true or false)
        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println(indexSmartphone4);//Mostra o índice de s4
    }
}