package us.com.harrison1.classeA;
//sobrecarga de métodos
import java.util.Scanner;

public class ClasseC {
 Scanner scan = new Scanner(System.in);
    int add (int x, int y){
        return x + y;
    }
    int add (int x, int y, int z){
        return x + y + z;
    }
    public void imprimir(){
        System.out.println("Enter two values");
        int result1 = add(scan.nextInt(), scan.nextInt());
        System.out.printf("Result 1: %d%n",result1);
        System.out.println("Enter three values");
        int result2 = add(scan.nextInt(), scan.nextInt(), scan.nextInt());
        System.out.printf("Result 2: %d%n",result2);
    }

}