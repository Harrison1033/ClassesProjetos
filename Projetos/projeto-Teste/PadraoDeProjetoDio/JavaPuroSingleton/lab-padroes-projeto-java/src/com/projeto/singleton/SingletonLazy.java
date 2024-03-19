package com.projeto.singleton;

/**
 * Singleton Preguiçoso
 * @author aguia
 */
public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy(){

    }
    public static SingletonLazy getInstance(){
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
