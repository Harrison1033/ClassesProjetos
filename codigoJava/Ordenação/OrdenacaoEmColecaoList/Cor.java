package estudando.classe1;

import java.util.Comparator;

public class PrimeiraClasse implements Comparator<TerceiraClasse> {

    @Override
    public int compare(TerceiraClasse g1, TerceiraClasse g2) {
        return g1.getColor().compareToIgnoreCase(g2.getColor());
    }
}
