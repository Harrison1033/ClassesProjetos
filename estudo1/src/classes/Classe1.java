package classes;
public class Classe1 {
    private String nome;
    private Classe4 classe4;
    private Classe3 classe3;
    static {
        System.out.println("---------------Relatório----------------");
    }
    public Classe1(String nome, Classe4 classe4) {
        this.nome = nome;
        this.classe4 = classe4;
    }
    public Classe1(String nome, Classe4 classe4,Classe3 classe3){
        this(nome,classe4);
        this.classe3 =  classe3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Classe4 getClasse4() {
        return classe4;
    }

    public void setClasse4(Classe4 classe4) {
        this.classe4 = classe4;
    }

    public Classe3 getClasse3() {
        return classe3;
    }

    public void setClasse3(Classe3 classe3) {
        this.classe3 = classe3;
    }

    @Override
    public String toString() {
        return "Nome = " + nome +", Tipo de Cliente = " + classe4 + " " + classe4.valor
                +", Tipo de Pagemento = " + classe3 + " R$: " +classe3.calculaValor(100);
    }
}
