package teste;

import java.util.List;

public class ClasseTres<T> {//O "T" representa o tipo(Type)
    private List<T>objetosDisponiveis;

    public ClasseTres(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }
    public T buscandoObjetoDisponivel(){
        System.out.println("Buscando Objeto disponível: ");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando Objeto: " + t);
        System.out.println("Objetos disponíveis para alugar");
        System.out.println(objetosDisponiveis);
        return t;
    }
    public void retornaObjetoAlugado(T t){
        System.out.println("Devlovendo Objeto " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponíveis para alugar: ");
        System.out.println(objetosDisponiveis);
    }
}
