import javax.swing.*;

public class ClassA {
    String aux;
    float largura, comprimento, area, perimetro;

    public void imprimir() {
        try {
            aux = JOptionPane.showInputDialog("Entre com o Comprimento: ");
            comprimento = Float.parseFloat(aux);//Transforma o valor auxiliar do comprimento de String para Float

            aux = JOptionPane.showInputDialog("Entre com a largura");
            largura = Float.parseFloat(aux);

            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            JOptionPane.showMessageDialog(null, "Area: " + area + ", Perimetro: " + perimetro);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro na conversão, digite apenas números " + e.toString());
        }
        System.exit(0);
    }
}
