import javax.swing.*;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        float num;
        String aux;
        ClassA classA = new ClassA();//Comprimento e Área
        ClassB classB = new ClassB();//Inclusão de frase no arquivo.txt
        ClassC classC = new ClassC();//Maior de idade ou não(Exception personalizado)
        ClassD classD = new ClassD();//Temporizador H m s
        ClassE classE = new ClassE();//Teste
        try {
            aux = JOptionPane.showInputDialog("Digite 1 p/ ClassA, 2 p/ ClassB, 3 p/ ClassC, 4 p/ ClassD e 5 p/ClassE: ");
            num = Float.parseFloat(aux);
            if (num == 1) {
                classA.imprimir();
            } else if (num == 2) {
                classB.imprimir();
            } else if (num == 3) {
                classC.imprimir();
            } else if (num == 4) {
                classD.imprimir();
            }else if (num == 5) {
                classE.imprimir();
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida: ");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro, Digite somente números: " + e.toString());
        }
        System.exit(0);
    }
}
