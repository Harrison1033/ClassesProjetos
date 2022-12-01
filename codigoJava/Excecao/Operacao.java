package estudando.classe1;

import java.util.InputMismatchException;

public class Operacao extends ClasseAbstrata {

    @Override
    public void imprime() {
        try {//bloca a ser tratado caso haja erro
            System.out.println("Digite um número: ");
            a = scan.nextInt();
            System.out.println("Digite o segundo número: ");
            b = scan.nextInt();
            operacao = a / b;
			System.out.println(operacao);
        } catch (ArithmeticException e) {//bloco para tratar erro aritimético
            System.out.println("erro não pode se dividir por zero: " + e);
        } catch (InputMismatchException e) {//bloco para tratar erro caso coloque algo que não seja número inteiro
            System.out.println("O resultado precisa ser um número inteiro: " + e);
        } finally {//Bloco opcional (no caso ele irá ser executado independentemente se o try for executado ou não
            System.out.println("Programa finalizado: ");
        }
    }
}
