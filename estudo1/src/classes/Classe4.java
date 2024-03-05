package classes;
//tipo Cliente
public enum Classe4 {
   PESSOA_FISICA (1),
    PESSOA_JURIDICA (2);
   public final int valor;

    Classe4(int valor) {
        this.valor = valor;
    }
}
