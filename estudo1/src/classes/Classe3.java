package classes;

public class Classe3 {
    static {
        System.out.println("Dentro do bloco estático classe3");
    }
    {
        System.out.println("Dentro do bloco de inicialização classe3");
    }
    public int soma(int a, int b){
        return 3 + 9;
    }
    protected int multiplica(){
        return 7 * 7;
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
        System.out.println("Multiplica: " + multiplica());
        System.out.println("Divide: " + divide(27,3));
    }
}
