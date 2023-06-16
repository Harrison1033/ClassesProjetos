package estudando.classe1;

import java.util.Objects;

public class TerceiraClasse {
    private String name;
    private Integer number;

    public TerceiraClasse(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TerceiraClasse contact = (TerceiraClasse) o;
        return name.equals(contact.name) && number.equals(contact.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}