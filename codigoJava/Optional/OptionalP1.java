package teste;

import java.util.List;
import java.util.Optional;
//OptionalP1
public class ClasseCinco {
    public static void main(String[] args) {
        Optional<String>nameOptional = findName("Harry");
        String empty = nameOptional.orElse("VAZIO");
        System.out.println(empty);
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));

    }
    private static Optional<String>findName(String name){
        List<String>list = List.of("Kelly","Harry");
        int i = list.indexOf(name);
        if (i != -1){
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
