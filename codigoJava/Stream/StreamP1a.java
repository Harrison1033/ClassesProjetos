package teste;

import java.util.Objects;

//StreamP1a
public class ClasseQuatro {
    private String title;
    private double price;

    public ClasseQuatro(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClasseQuatro)) return false;
        ClasseQuatro that = (ClasseQuatro) o;
        return Objects.equals(getTitle(), that.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle());
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "LightNovel {" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
