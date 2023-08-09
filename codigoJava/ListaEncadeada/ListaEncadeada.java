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
	
	 public T get(int index) {//Implementaçao do método get
        return getNo(index).getConteudo();
    }
	
	 private No<T> getNo(int index){//Implementaçao do método getNo
        validaIndice(index);
        No<T>noAuxiliar = referenciaEntrada;
        No<T>noRetorno = null;
        for (int i = 0 ; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
        }
		
		 public T romove(int index){ // Implementação do método remove
        No<T> noPivor = this.getNo(index);
        if (index == 0){
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }
        No<T> noAnterior = getNo(index -1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
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
	 private void validaIndice(int index){//Método para validar o ídice
        if (index >= size()){
            int ultimoIndice = size()-1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no ídice: " + index + "desta lista. a lista atual é: " + ultimoIndice);
        }
    }
    
    public boolean isEmpty(){ //Método
        return referenciaEntrada == null ? true : false;
    }
	
	 @Override
    public String toString() {//Método toString(personalizado)
        String strRetorno = " ";
        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size(); i++) {
            strRetorno += "[No { conteudo = " + noAuxiliar.getConteudo() + "}--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
