import javax.swing.*;

public class ClassF {
    public static void main(String[] aargs) {
        String aux;
        aux = JOptionPane.showInputDialog("Digite o primeiro número");
        int numero1 = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("Digite o segundo número");
        int numero2 = Integer.parseInt(aux);
        try {
            if (numero1 > numero2) {
                //A exceção IllegalArgumentException é usada para indicar que o segundo número deve ser maior que o primeiro.
                throw new IllegalArgumentException("O segundo número deve ser maior que o primeiro.");
            }
            contar(numero1, numero2);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    static void contar(int numero1, int numero2) {
        //O loop for é usado para imprimir os números entre numero1 e numero2.
        for (int i = numero1; i < numero2; i++) {
            JOptionPane.showMessageDialog(null, i);
        }
        System.exit(0);
    }
}
