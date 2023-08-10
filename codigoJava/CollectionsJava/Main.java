
public class Main {
	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 2");
		System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

		listaTarefa.removerTarefa("Tarefa 1");
		System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

		listaTarefa.obterDescricoesTarefas();
	}	
}