package teste;

//ReferenciaMetodosEstaticosA1
//Anime
public class ClasseUm {
    private String title;
    private int episodes;

    public ClasseUm(String title, int episodes) {
        this.title = title;
        this.episodes = episodes;
    }

    public String getTitle() {
        return title;
    }

    public int getEpisodes() {
        return episodes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", episodes=" + episodes +
                '}';
    }
}
