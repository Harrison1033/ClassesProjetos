package teste;

import java.util.Scanner;

public class ParametrosInvalidosException {
    Scanner scan = new Scanner(System.in);

    public void digita() throws Exception {
        System.out.println("Digite o primeiro número");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = scan.nextInt();
        int result = num2 - num1;
        if (num1 < num2) {
            for (int i = 0; i < result; i++) {
                System.out.println(i + 1);
            }
        }else
            throw new Exception("O primeiro númeor não pode ser menor que o segundo");
    }

}
