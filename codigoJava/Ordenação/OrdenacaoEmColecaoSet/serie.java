package estudando.classe1;

import java.util.Objects;

public class QuartaClasse implements Comparable<QuartaClasse>{
    private String name;
    private String gender;
    private Integer episodeTime;

    public QuartaClasse(String name, String gender, Integer episodeTime) {
        this.name = name;
        this.gender = gender;
        this.episodeTime = episodeTime;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Integer getEpisodeTime() {
        return episodeTime;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", episodeTime=" + episodeTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuartaClasse)) return false;
        QuartaClasse that = (QuartaClasse) o;
        return getName().equals(that.getName()) && getGender().equals(that.getGender()) && getEpisodeTime().equals(that.getEpisodeTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getGender(), getEpisodeTime());
    }

    @Override
    public int compareTo(QuartaClasse serie) {
        int episodeTime = Integer.compare(this.getEpisodeTime(),serie.getEpisodeTime());
       if (episodeTime != 0) return episodeTime;
        return this.getGender().compareTo(serie.getGender());
    }
}
