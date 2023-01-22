package teste;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

//NavigableSet_TreeSetP1a
class SmartphoneMarcaComparator implements Comparator<ClasseUm>{

    @Override
    public int compare(ClasseUm o1, ClasseUm o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}
public class ClasseCinco {
    public static void main(String[] args) {
        NavigableSet<ClasseUm> set = new TreeSet<>(new SmartphoneMarcaComparator());
        ClasseUm smartphone = new ClasseUm("123","Nokia");
        ClasseUm smartphone1 = new ClasseUm("321","Samsung");
        set.add(smartphone);
        set.add(smartphone1);
        System.out.println(set);

    }
}
