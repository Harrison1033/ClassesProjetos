package classes;
//For / While / do While
public class Classe2 {
    private int num1 = 10;
    private int num2 = 15;
    private int num3 = 20;
    public void imprimir(){
        for (int i = 0; i <= num1; i++){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        while (num2 <= 30){
            System.out.print(num2 + " ");
            num2++;
        }
        System.out.println(" ");
        do {
            System.out.print(num3 + " ");
            num3--;
        }while (num3>=0);
    }
}
