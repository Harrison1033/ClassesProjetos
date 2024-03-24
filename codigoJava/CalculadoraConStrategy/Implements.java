package classes;


public class Implements {

    static class AddOperacao implements Operacao{

        @Override
        public double execute(double numero1, double numero2) {
            return numero1 + numero2;
        }
    }
    static class SubtraiOperacao implements Operacao{

        @Override
        public double execute(double numero1, double numero2) {
            return numero1 - numero2;
        }
    }
    static class MultiplicaOperacao implements Operacao{

        @Override
        public double execute(double numero1, double numero2) {
            return numero1 * numero2;
        }
    }
    static class DivideOperacao implements Operacao{

        @Override
        public double execute(double numero1, double numero2) {
            return numero1 / numero2;
        }
    }
}
