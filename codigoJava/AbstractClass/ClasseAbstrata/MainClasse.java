package estudando.classeMain;

import estudando.classe1.SegundaClasse;
import estudando.classe1.TerceiraClasse;

public class MainClasse {
    public static void main(String[] args) {
        SegundaClasse terceiraClasse = new TerceiraClasse();
        terceiraClasse.pegar();
        System.out.println(terceiraClasse.getPosicaoX());
    }
}
