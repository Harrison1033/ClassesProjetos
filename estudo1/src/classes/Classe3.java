package classes;

public class Classe3 {
    public int soma(int a, int b){
        return a + b;
    }
    protected int multiplica(int a, int b){
        return a * b;
    }
    protected int subtrai (int a, int b){
        return a - b;
    }
    private double divide (int x, int y){
        if (y == 0){
           return 0;
        }
        return x / y;
    }
    public void imprimir(){
        System.out.println("Soma: "+soma(3,9));
        System.out.println("Subtrai: " + subtrai(14,9));
        System.out.println("Multiplica: " + multiplica(7,7));
        System.out.println("Divide: " + divide(27,3));
    }
}
