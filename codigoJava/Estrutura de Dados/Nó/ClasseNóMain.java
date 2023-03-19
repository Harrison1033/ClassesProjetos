package teste;
//ClasseNóMain
public class ClasseTres {
    public static void main(String[] args) {
        ClasseDois<String> no1 = new ClasseDois<>("Conteúdo no1");
        //Tentar setar o conteúdo como string
        ClasseDois<String> no2 = new ClasseDois<>("Conteúdo no2");
        no1.setProximoNo(no2);

        ClasseDois<String> no3 = new ClasseDois<>("Conteúdo no3");
        no2.setProximoNo(no3);

        ClasseDois<String> no4 = new ClasseDois<>("Conteúdo no4");
        no3.setProximoNo(no4);

        System.out.println(no1.toStringEncadeado());
        System.out.println(no2.toStringEncadeado());
        System.out.println(no3.toStringEncadeado());
        System.out.println(no4.toStringEncadeado());
    }
}
