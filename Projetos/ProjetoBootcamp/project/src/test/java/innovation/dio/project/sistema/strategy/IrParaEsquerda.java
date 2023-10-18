package innovation.dio.project.sistema.strategy;

public class IrParaEsquerda implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movendo-se para esquerda");
    }
}
