package innovation.dio.project.sistema.strategy;

public class IrParaDireito implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se para a direita");
    }
}
