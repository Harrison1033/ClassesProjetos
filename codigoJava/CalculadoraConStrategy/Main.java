package classes;

import java.util.Scanner;

//Classe Main de User
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Implements.AddOperacao addOperacao = new Implements.AddOperacao();
        Implements.SubtraiOperacao subtraiOperacao = new Implements.SubtraiOperacao();
        Implements.MultiplicaOperacao multiplicaOperacao = new Implements.MultiplicaOperacao();
        Implements.DivideOperacao divideOperacao = new Implements.DivideOperacao();
        //Criando a calculadora
        Calculadora calculadora = new Calculadora();
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
            case "+" -> calculadora.setOperacao(addOperacao);
            case "-" -> calculadora.setOperacao(subtraiOperacao);
            case "*" -> calculadora.setOperacao(multiplicaOperacao);
            case "/" -> calculadora.setOperacao(divideOperacao);
            default -> {
                System.out.println("Opção Inválida");
            }
        }
        //Realiza a operação e imprime o resultado
        double result = calculadora.performOperacao(numero1,numero2);
        System.out.println(result);

    }
}
