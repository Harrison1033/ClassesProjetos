package estudando.classe1;

//EqualsB1
public class SegundaClasse {
    public static void main(String[] args) {//neste caso se considera igual somente se o serial for igual
        PrimeiraClasse s1 = new PrimeiraClasse("1ABC1", "iFome");
        PrimeiraClasse s2 = new PrimeiraClasse("1ABC1", "iFome");
        System.out.println(s1.equals(s2));
    }

}
