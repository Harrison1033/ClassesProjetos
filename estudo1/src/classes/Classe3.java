package classes;

// tipo Pagamento
public enum Classe3 {
    CREDITO {
        @Override
        public double calculaValor(double valor) {
            return valor = valor - valor * 0.1;
        }
    },
    DEBITO {
        @Override
        public double calculaValor(double valor) {
            return valor = valor - valor * 0.05;
        }
    };

    public abstract double calculaValor(double valor);

}
