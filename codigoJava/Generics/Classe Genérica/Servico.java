package teste;

import java.util.List;

public class ClasseTres<T> {//O "T" representa o tipo(Type)...
    private List<T>avaliableObjects;

    public ClasseTres(List<T> avaliableObjects) {
        this.avaliableObjects = avaliableObjects;
    }
    public T buscandoObjetoDisponivel(){
        System.out.println("Searching avaliable objects: ");
        T t = avaliableObjects.remove(0);
        System.out.println("Renting Object: " + t);
        System.out.println("Objects avaliable for rent");
        System.out.println(avaliableObjects);
        return t;
    }
    public void retornaObjetoAlugado(T t){
        System.out.println("Returning object " + t);
        avaliableObjects.add(t);
        System.out.println("Objects avaliable for rent: ");
        System.out.println(avaliableObjects);
    }
}
