package teste;
//ReferenciaMetodosEstaticosA2
//AnimeComparators
public class ClasseDois {
    public static int compareByTitle(ClasseUm a1, ClasseUm a2){
        return a1.getTitle().compareTo(a2.getTitle());
    }
    public static int compareByEpisodes(ClasseUm a1, ClasseUm a2){
        return Integer.compare(a1.getEpisodes(),a2.getEpisodes());
    }
	 public int compareByEpisodesNonStatic(ClasseUm a1, ClasseUm a2){
        return Integer.compare(a1.getEpisodes(),a2.getEpisodes());
    }
}


