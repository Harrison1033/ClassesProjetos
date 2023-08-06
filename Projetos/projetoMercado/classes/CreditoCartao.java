package projetoMercado.classes;

public class CreditCard extends PymentMethod {
    Installments installmentes = new Installments(0);


    public CreditCard(double value) {
        super(value);
    }
    public void creditCalc(){
        if (value > 0 && option == 3){
            installmentes.installmentesCalc();
        }
    }
}
