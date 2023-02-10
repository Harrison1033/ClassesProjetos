package teste;
//Classe Local
public class MainUm {//pode ser colocado dentro do método ou dentro do bloco de inicialização
    private String name = "Luffy";
    void print(){//Método
        String lastName = "Di Monkey";//é final, sendo implícito
        class LocalClass{//Classe interna dentro do método
            public void printLocal(){//Método da classe Interna
                System.out.println(name + " " +lastName);
            }
        }
        new LocalClass().printLocal();
    }
    public static void main(String[] args) {
       MainUm mainUm = new MainUm();
       mainUm.print();
    }
}