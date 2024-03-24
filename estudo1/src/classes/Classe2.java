package classes;

import java.util.Scanner;

//Classe Main de User
public class Classe2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Classe3.AddOperacao addOperacao = new Classe3.AddOperacao();
        Classe3.SubtraiOperacao subtraiOperacao = new Classe3.SubtraiOperacao();
        Classe3.MultiplicaOperacao multiplicaOperacao = new Classe3.MultiplicaOperacao();
        Classe3.DivideOperacao divideOperacao = new Classe3.DivideOperacao();
        //Criando a calculadora
        Classe1 classe1 = new Classe1();
        //Obtenha os números do usuário
        System.out.println("Digite o Primeiro número:--");
        double numero1 = scan.nextDouble();
        System.out.println("Digite o Segundo número:--");
        double numero2 = scan.nextDouble();
        //Obtenha o operador do usuário
        System.out.println("Digite o sinal da Operação matemática:--");
        String operacao = scan.next();
        //Configurando a Operação na Calculadora
        switch (operacao){
            case "+" -> classe1.setClasse4(addOperacao);
            case "-" -> classe1.setClasse4(subtraiOperacao);
            case "*" -> classe1.setClasse4(multiplicaOperacao);
            case "/" -> classe1.setClasse4(divideOperacao);
            default -> {
                System.out.println("Opção Inválida");
            }
        }
        //Realiza a operação e imprime o resultado
        double result = classe1.performOperacao(numero1,numero2);
        System.out.println(result);

    }
}
