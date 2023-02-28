package teste;
//Mangá
public class ClasseUm {
   private Integer id;//Com Integer e String posso usar o equals
   private String title;
   private int chapters;

    public ClasseUm(Integer id, String title, int chapters) {
        this.id = id;
        this.title = title;
        this.chapters = chapters;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getChapters() {
        return chapters;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "Mangá {" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", chapters=" + chapters +
                '}';
    }
}

