package innovation.dio.project.sistema.strategy;

public class Carro {
    private Comportamento comportamento;
    public void setComportamento(Comportamento comportamento){
        this.comportamento = comportamento;
    }
	public void ligar(){
		comportamento.ligar();
	}
    public void mover(){
        comportamento.mover();
    }
}
