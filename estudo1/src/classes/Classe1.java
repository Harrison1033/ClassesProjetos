package classes;
//Desafio Bootcamp 05 (Cofres Seguros: Dominando o Encapsulamento e Abstração)

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}

class CofreDigital extends Cofre {

    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }
}

class CofreFisico extends Cofre {

    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }

}

public class Classe1 {
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite se o cofre é fisico ou digital");
        String tipoCofre = scanner.nextLine();

        //  Implemente a condição necessário para a verificação dos cofres seguros:
        try {
            if (tipoCofre.equalsIgnoreCase("digital")) {
                System.out.println("Digite a senha do cofre: ");
                int senha = scanner.nextInt();
                System.out.println("Confirme a senha do cofre: ");
                int confirmacaoSenha = scanner.nextInt();
                CofreDigital cofreDigital = new CofreDigital(senha);
                boolean senhaValida = cofreDigital.validarSenha(confirmacaoSenha);
                if (senhaValida) {
                    System.out.println("""
                            Tipo: Cofre Digital
                            Metodo de abertura: Senha
                            Cofre aberto!""");
                } else {
                    System.out.println("""
                            Tipo: Cofre Digital
                            Metodo de abertura: Senha
                            Senha incorreta!""");
                }

            } else {
                if (!tipoCofre.equalsIgnoreCase("fisico")) {
                    //A exceção IllegalArgumentException é usada para indicar que o segundo número deve ser maior que o primeiro.
                    throw new IllegalArgumentException("Informação inválida: necessário ser fisico ou digital.");
                } else {
                    System.out.println("Tipo: Cofre Fisico\n" + "Metodo de abertura: Chave");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("O valor digitado tem que ser numérico: \n" + e);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage()+ "\nIllegalArgumentException" );
        }
    }
}

