import javax.swing.*;

public class ClassE {
    private double num1, num2;
    public void imprimir(){
        try {
            double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor numérico: "));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um segundo número"));
            double result = num1 * num2;
            JOptionPane.showMessageDialog(null,"Resultado: " + result);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Digite um número válido: " + e.toString());
        }
    }
}
