package classes;

//Classe Implements
public class Classe3 {

    static class AddOperacao implements Classe4{

        @Override
        public double execute(double numero1, double numero2) {
            return numero1 + numero2;
        }
    }
    static class SubtraiOperacao implements Classe4{

        @Override
        public double execute(double numero1, double numero2) {
            return numero1 - numero2;
        }
    }
    static class MultiplicaOperacao implements Classe4{

        @Override
        public double execute(double numero1, double numero2) {
            return numero1 * numero2;
        }
    }
    static class DivideOperacao implements Classe4{

        @Override
        public double execute(double numero1, double numero2) {
            return numero1 / numero2;
        }
    }
}
