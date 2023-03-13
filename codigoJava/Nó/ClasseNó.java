package teste;

//ClasseNó
public class ClasseDois<T> {
    public T conteudo;
    public ClasseDois proximoNo = null;

    public ClasseDois(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public ClasseDois getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(ClasseDois porximoNo) {
        this.proximoNo = porximoNo;
    }

    @Override
    public String toString() {
        return "No{" + conteudo + '}';
    }

    public String toStringEncadeado() {
        String str = "No{" + conteudo + "}";

        if (proximoNo != null) {
            str += "->" + proximoNo.toString();
        } else {
            str += "->null";
        }
        return str;
    }
}

