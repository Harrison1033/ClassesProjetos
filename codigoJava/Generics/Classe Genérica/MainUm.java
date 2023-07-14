package teste;

import java.util.ArrayList;
import java.util.List;

public class MainUm {
    public static void main(String[] args) {
        List<ClasseUm>carsAvailable = new ArrayList<>(List.of(new ClasseUm("BMW"),new ClasseUm("Fusca")));
        List<ClasseDois>barcosDisponiveis = new ArrayList<>(List.of(new ClasseDois("Lancha"),new ClasseDois("Canoa")));

        ClasseTres<ClasseUm>umClasseTres = new ClasseTres<>(carsAvailable);
        ClasseUm carro = umClasseTres.buscandoObjetoDisponivel();
        System.out.println("Usando o carro por um mês...");
        umClasseTres.retornaObjetoAlugado(carro);

        System.out.println("____________________________________");

        ClasseTres<ClasseDois>doisClasseTres = new ClasseTres<>(barcosDisponiveis);
        ClasseDois barco = doisClasseTres.buscandoObjetoDisponivel();
        System.out.println("Usando o barco por um mês...");
        doisClasseTres.retornaObjetoAlugado(barco);
    }
}