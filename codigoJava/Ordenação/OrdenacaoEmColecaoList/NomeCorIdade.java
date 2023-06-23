package estudando.classe1;

import java.util.Comparator;

public class QuartaClasse implements Comparator<TerceiraClasse> {
    @Override
    public int compare(TerceiraClasse g1, TerceiraClasse g2) {
        int name = g1.getName().compareToIgnoreCase(g2.getName());
        if (name != 0) return name;
        int color = g1.getColor().compareToIgnoreCase(g2.getColor());
        if (color != 0) return color;
        return Integer.compare(g1.getAge(),g2.getAge());
    }
}
