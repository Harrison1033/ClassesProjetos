package estudando.classe1;

public class Main {
    public static void main(String[] args) {
    Atendente atendente = new Atendente("Nubia Souza",32,1488,1);
    Atendente atendente1 = new Atendente("Rafael Nonato",42,1399,3);
    Supervisor supervisor = new Supervisor("Andrea Lima Pereira", 40,1603,8);
    Supervisor supervisor1 = new Supervisor("Eliel Nunes Marques",42,1677,9);
        System.out.println(atendente);
        System.out.println(atendente1);
        System.out.println(supervisor);
        System.out.println(supervisor1);
    }
}