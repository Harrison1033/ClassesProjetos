package estudando.classe1;

public class TerceiraClasse implements Comparable<TerceiraClasse> {
    private String name;
    private Integer age;
    private String color;

    public TerceiraClasse(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(TerceiraClasse terceiraClasse) {
        return this.getName().compareToIgnoreCase(terceiraClasse.getName());

    }
}