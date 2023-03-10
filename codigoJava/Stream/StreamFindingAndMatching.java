package teste;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//FindingAndMatching
public class MainUm {
    private static List<ClasseQuatro> lightNovels = new ArrayList<>(List.of(
            new ClasseQuatro("Tensei Shittara", 8.99),
            new ClasseQuatro("Over Lord", 3.99),
            new ClasseQuatro("Violet Evergarden", 5.99),
            new ClasseQuatro("No Game no Life", 2.99),
            new ClasseQuatro("Full Metal Alchimist", 5.99),
            new ClasseQuatro("Kumo Desuga", 1.99),
            new ClasseQuatro("Monogatori", 4.00)
    ));
    public static void main(String[] args) {
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice()>8));//se tem algum valor acima de 8
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice()>0));//se todos os valores estão acima de 0
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice()<0));//se todos não forem menos que 0

        lightNovels.stream()
                .filter(ln-> ln.getPrice()>3)//Filtra todos os valores maiores que 3
                .findAny()//Escolhe um valor maior que 3 aleatóriamente
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln->ln.getPrice()>3)
                .sorted(Comparator.comparing(ClasseQuatro::getPrice).reversed())//o .reversed inverte ordem dos valores
                .findFirst()
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln->ln.getPrice()>3)//Faz o mesmo que o código acima
                .max(Comparator.comparing(ClasseQuatro::getPrice))
                .ifPresent(System.out::println);
    }
}