package innovation.dio.project.sistema;

import innovation.dio.project.sistema.facade.Facade;
import innovation.dio.project.sistema.singleton.SingletonEager;
import innovation.dio.project.sistema.singleton.SingletonLazy;
import innovation.dio.project.sistema.singleton.SingletonLazyHolder;
import innovation.dio.project.sistema.strategy.*;

public class Test {
    public static void main(String[] args) {
        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy

        Comportamento ligar = new Ligar();
        Comportamento irEmFrente = new IrEmFrente();
        Comportamento irParaDireita = new IrParaDireita();
        Comportamento irParaEsquerda = new IrParaEsquerda();

        Carro carro = new Carro();
		carro.setComportamento(ligar);
		carro.ligar();
        carro.setComportamento(irEmFrente);
        carro.mover();
        carro.mover();
        carro.setComportamento(irParaDireita);
        carro.mover();
        carro.setComportamento(irParaEsquerda);
        carro.mover();
        carro.mover();
        carro.mover();

        // Facade

        Facade facade = new Facade();
        facade.migrarCliente("Harry Osborn", "60532420");
    }
}
