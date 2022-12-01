package estudando.classe1;

import java.util.Comparator;

public class SegundaClasse implements Comparator<TerceiraClasse> {

    @Override
    public int compare(TerceiraClasse g1, TerceiraClasse g2) {
        return Integer.compare(g1.getIdade(),g2.getIdade() );
    }
}