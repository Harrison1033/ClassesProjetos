package estudando.classe1;

import java.util.Comparator;

public class QuartaClasse implements Comparator<TerceiraClasse> {
    @Override
    public int compare(TerceiraClasse g1, TerceiraClasse g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;
        return Integer.compare(g1.getIdade(),g2.getIdade());
    }
}
