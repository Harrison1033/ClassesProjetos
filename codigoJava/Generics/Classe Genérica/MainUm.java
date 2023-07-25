package teste;

import java.util.ArrayList;
import java.util.List;

public class MainUm {
    public static void main(String[] args) {
        List<ClasseUm>carsAvailable = new ArrayList<>(List.of(new ClasseUm("BMW"),new ClasseUm("Fusca")));
        List<ClasseDois>barcosDisponiveis = new ArrayList<>(List.of(new ClasseDois("Lancha"),new ClasseDois("Canoa")));
		//for car
        ClasseTres<ClasseUm>umClasseTres = new ClasseTres<>(carsAvailable);
        ClasseUm car = umClasseTres.buscandoObjetoDisponivel();
        System.out.println("Usingi the car for a month...");
        umClasseTres.retornaObjetoAlugado(car);

        System.out.println("____________________________________");

        ClasseTres<ClasseDois>doisClasseTres = new ClasseTres<>(boatsAvaliable);
        ClasseDois boat = doisClasseTres.buscandoObjetoDisponivel();
        System.out.println("Using the boat for a month...");
        doisClasseTres.retornaObjetoAlugado(boat);
    }
}