package estudando.classe1;

import java.io.Serial;
import java.io.Serializable;
//SerializationA1

/**
 * Para não mostrar a senho no intellij digite Ctrl + Shift + A e na caixa de diálogo digite:
 * Serializable class without 'serialVesionUID, em seguida selecione ON e no nome da classe
 * Alt + enter e escolha a opção Add 'serialVersionUID'... daí aparecerá o @Serial
 * Daí no private String password escreva transiente como escrito abaixo.
 */
public class SegundaClasse implements Serializable {
    @Serial
    private static final long serialVersionUID = -7947277142865235727L;
    private Long id;
    private String nome;
    private transient String password;

    public SegundaClasse(Long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Override
    public String toString() {
        return "SegundaClasse{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
