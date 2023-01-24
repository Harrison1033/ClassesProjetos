package teste;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

//ConsumidorP2
public class ClasseUm {
private Long id;
private String nome;

    public ClasseUm(String nome) {
        this.id = ThreadLocalRandom.current().nextLong(0,100_000);
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClasseUm)) return false;
        ClasseUm classeUm = (ClasseUm) o;
        return Objects.equals(id, classeUm.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Consumidor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }
}

