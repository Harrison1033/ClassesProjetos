package teste;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
//MangaRepository
public class ClasseDois {
  private static List<ClasseUm>mangas = List.of(new ClasseUm(1,"Bleach",150),new ClasseUm(2,"Overlord",25));

  public static Optional<ClasseUm>findById(Integer id){
      return findBy(m -> m.getId().equals(id));
  }

  public static Optional<ClasseUm>findByTitle(String title){
      return findBy(m -> m.getTitle().equals(title));
  }

  public static Optional<ClasseUm>findBy(Predicate<ClasseUm>predicate){
      ClasseUm found = null;
      for (ClasseUm manga : mangas){
         if (predicate.test(manga)){
             found = manga;
         }
      }
      return Optional.ofNullable(found);
  }
}

