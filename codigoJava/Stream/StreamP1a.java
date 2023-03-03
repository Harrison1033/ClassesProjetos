package teste;

//StreamP1a
public class ClasseQuatro {
    private String title;
    private double price;

    public ClasseQuatro(String title, double price) {
        this.title = title;
        this.price = price;
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
