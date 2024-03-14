package classes;

//if / else
public class Classe4 {
    private int idade = 18;
    private int matricula = 101;
    private String result;
    public void imprimir(){
        if (idade>17 && matricula > 100){
            System.out.println("Funcionário");
        }else if (idade <= 17 &&  idade>0 && matricula <= 100 && matricula>0){
            System.out.println("Estagiário");
        }else
            System.out.println("Inválido");
        //Operador Ternário
        result = idade > 15 ? "Apto" : "Inapto";
        System.out.println(result);
    }
}
