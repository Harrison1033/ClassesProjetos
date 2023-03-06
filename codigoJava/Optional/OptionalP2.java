package teste;

import java.util.Optional;

//OptionalP2
public class ClasseTres {
    public static void main(String[] args) {
        Optional<ClasseUm>mangaByTitle = ClasseDois.findByTitle("Bleach");
        mangaByTitle.ifPresent(m -> m.setTitle("Bleacha2"));//Troca o nome do Mangá
        System.out.println(mangaByTitle);

        ClasseUm mangaById = ClasseDois.findById(2)//Se não houver o id, ele lança exceção
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        ClasseUm newManga = ClasseDois.findByTitle("Drifters")//Adiciona Mangá, caso não exista
                .orElseGet(()-> new ClasseUm(3,"Drifters",20));
        System.out.println(newManga);
    }
}
