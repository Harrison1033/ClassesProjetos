package projetoMercado.classes;

public class DebitCard extends PymentMethod{
    double debito ;
    public DebitCard(double value) {
        super(value);
    }
    public void debitCalc(){
        if (value > 0 && option == 2){
            debito = option +( option * 0.05);
            System.out.println("The debit amount will be: " + debito);
        }else {
            System.out.println("Invalid value: ");
        }
    }
}
