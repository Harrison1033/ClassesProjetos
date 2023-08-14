package teste;

import java.util.ArrayList;
import java.util.List;


public class CarrinhoDeCompras {
    private List<ClasseCinco> itemLista;

    public CarrinhoDeCompras() {
        this.itemLista = new ArrayList<>();
    }
    //Adiciona nome, preço e quantidade
    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome,preco,quantidade);
        this.itemLista.add(item);
    }
    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemLista.isEmpty()) { //Caso o itemLista não esteja vazio
            for (Item i : itemLista) {// ele percorre o array procurando o nome para remover
                if (i.getNome().equalsIgnoreCase(nome)) { //ignorando o camel case
                    itensParaRemover.add(i);
                }
            }
            itemLista.removeAll(itensParaRemover);
        } else { //caso o array esteja vazio, ele irá mostrar a mensagem abaixo
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemLista.isEmpty()) {
            for (Item item : itemLista) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
        //Exibe todos os ítens adicionados juntamente com o toString
    public void exibirItens() {
        if (!itemLista.isEmpty()) {
            System.out.println(this.itemLista);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + itemLista +
                '}';
    }
}
