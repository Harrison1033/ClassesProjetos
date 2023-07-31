package teste;
//Lista Encadeada isEmpty and size

public class ListaEncadeada<T> { //Tipo Genérico
    No<T> referenciaEntrada;

    public ListaEncadeada() { //construtor
        this.referenciaEntrada = null;
    }
    public int size(){ //Método com a lógica de negócio
        int tmamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        while (true){
            if (referenciaAux != null){
                tmamanhoLista ++;
                if (referenciaAux.getProximoNo()!= null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else {
                    break;
                }
            }else {
                break;
            }
        }
        return tmamanhoLista;
    }
    
    public boolean isEmpty(){ //Método
        return referenciaEntrada == null ? true : false;
    }
}
