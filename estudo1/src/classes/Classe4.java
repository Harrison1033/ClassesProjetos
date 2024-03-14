package classes;

//if / else
public class Classe4 {
    private int idade = 19;
    private int matricula = 101;
    private String result;
    public void imprimir(){
        if (idade>17 && matricula > 100){
            System.out.println("Funcionário");
        }else if (idade<=0 && matricula<=0){
            System.out.println("Inválido");
        }else
            System.out.println("Estagiário");
        //Operador Ternário
        result = idade > 15 ? "Apto" : "Inapto";
        System.out.println(result);
    }
}
