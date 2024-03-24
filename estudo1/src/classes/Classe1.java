package classes;
//Calculadora
public class Classe1 {
    private Classe4 classe4;

    public void setClasse4(Classe4 classe4){
        this.classe4 = classe4;
    }
    public double performOperacao(double numero1, double numero2){
        return classe4.execute(numero1,numero2);
    }
}

