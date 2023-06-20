package estudando.classe1;

import java.util.Objects;

public class PrimeiraClasse  {
    private String name;
    private Integer pages;

    public PrimeiraClasse(String name, Integer pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public Integer getPages() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PrimeiraClasse)) return false;
        PrimeiraClasse that = (PrimeiraClasse) o;
        return getName().equals(that.getName()) && getPages().equals(that.getPages());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPages());
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}
