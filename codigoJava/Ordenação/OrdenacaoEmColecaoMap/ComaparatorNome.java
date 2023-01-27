package estudando.classe1;

import java.util.Comparator;
import java.util.Map;

public class SegundaClasse implements Comparator<Map.Entry<String,PrimeiraClasse>> {


    @Override
    public int compare(Map.Entry<String, PrimeiraClasse> l1, Map.Entry<String, PrimeiraClasse> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}
