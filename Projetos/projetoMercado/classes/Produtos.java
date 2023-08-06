package projetoMercado.classes;

public class Products {
    protected String name;
    protected int code;
    protected double value = 0;

    public Products(String name, int code, double value) {
        this.name = name;
        this.code = code;
        this.value = value;
    }
    public Produtos(double value) {
        this.value = value;
    }
}
