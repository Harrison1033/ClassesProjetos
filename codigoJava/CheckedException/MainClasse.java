package estudando.classeMain;

import estudando.classe1.PrimeiraClasse;

public class MainClasse {
    public static void main(String[] args) {
        PrimeiraClasse primeiraClasse = new PrimeiraClasse(1000);
        try {
            primeiraClasse.sacar(700);
            System.out.println("saque realizado com sucesso: ");
        } catch (Exception exception) {
            System.out.println("Ocorreu um erro: " + exception.getMessage());
        }
        System.out.println("Saldo Atual: " + primeiraClasse.getSaldo());
    }
}
