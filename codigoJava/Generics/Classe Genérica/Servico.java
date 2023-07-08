package teste;

import java.util.List;

public class ClasseTres<T> {//O "T" representa o tipo(Type)...
    private List<T>avaliableObjects;

    public ClasseTres(List<T> avaliableObjects) {
        this.avaliableObjects = avaliableObjects;
    }
    public T buscandoObjetoDisponivel(){
        System.out.println("Buscando Objeto disponível: ");
        T t = avaliableObjects.remove(0);
        System.out.println("Alugando Objeto: " + t);
        System.out.println("Objetos disponíveis para alugar");
        System.out.println(avaliableObjects);
        return t;
    }
    public void retornaObjetoAlugado(T t){
        System.out.println("Devlovendo Objeto " + t);
        avaliableObjects.add(t);
        System.out.println("Objetos disponíveis para alugar: ");
        System.out.println(avaliableObjects);
    }
}
