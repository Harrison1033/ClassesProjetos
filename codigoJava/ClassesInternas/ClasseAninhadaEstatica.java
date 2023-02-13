package teste;
//ClasseAninhadaEstatica
public class ClasseUm {
    private String name = "Ichigo";

    static class Nested {//Só acessa valores estáticos da outra classe
        private String lastName = "Kurosake";

        void print() {
            System.out.println(new ClasseUm().name + " " + lastName);//para acessar valor não estático
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
