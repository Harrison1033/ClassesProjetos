import javax.swing.*;

public class ClassC {
    public void imprimir() {
        try {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
            if (idade < 18) {
                throw new Exception("Menor de idade, entrada não permitida: ");
            } else {
                JOptionPane.showMessageDialog(null, "Idade válida, seja bem vindo: ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite somente números " + e.toString());
        }
        System.exit(0);
    }
}
