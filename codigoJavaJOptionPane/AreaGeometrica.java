package es.com.curso.principal;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class TesteMain {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        double a, b, c;
        String p, s, t;
        double quadrado, circulo, trapezio, retangulo, triangulo;
        p = JOptionPane.showInputDialog("Entre com o primeiro valor: ");
        s = JOptionPane.showInputDialog("Entre como o segundo valor: ");
        t = JOptionPane.showInputDialog("Entre com o terceiro valor: ");
        a = Integer.parseInt(p);
        b = Integer.parseInt(s);
        c = Integer.parseInt(t);
        triangulo = (a * c)/2;
        circulo = 3.14159 * Math.pow(c,2);
        trapezio = ((a+b)*c)/2;
        quadrado = b*b;
        retangulo = a * b;
        JOptionPane.showMessageDialog(null,"A área do triangulo é: " + df.format(triangulo),"Resultado",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"A área do circulo é: " + df.format(circulo),"Resultado",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"A área do trapezio é: " + df.format(trapezio),"Resultado",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"A área do quadrado é: " + df.format(quadrado),"Resultado",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"A área do retangulo é: " + df.format(retangulo),"Resultado",JOptionPane.PLAIN_MESSAGE);



    }
}