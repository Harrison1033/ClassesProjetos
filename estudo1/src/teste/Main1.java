package teste;

import classes.Classe2;

//
public class Main1 {
    public static void main(String[] aargs) {
      String nomes [] = {"João ", "Maria " , "Nícolas " , "Betty", "Walter " , "Joana "};
      for (int i = 0; i<nomes.length;i++){
          System.out.println("Matrícula: " + (i+1) + " Nome: " + nomes[i]);
      }
    }
}