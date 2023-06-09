package projetoMercado.classes;

public class Money extends FormaPagamento {
    double money;

    public Money(double value) {
        super(value);
    }

    public void moneyCalc(){
    if (value > 0 && option == 1){
        money = value + (value * 0.1);
        System.out.println("The final value is: " + money);
    }else {
        System.out.println("Invalid value: ");
    }
}
}
