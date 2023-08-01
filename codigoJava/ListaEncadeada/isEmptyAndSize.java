package teste;
//Lista Encadeada isEmpty and size

public class ListaEncadeada<T> { //Tipo Genérico
    No<T> referenciaEntrada;

    public ListaEncadeada() { //construtor
        this.referenciaEntrada = null;
    }
	
	 public void add(T conteudo){// incluindo o método add()
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }
        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size()-1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
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
