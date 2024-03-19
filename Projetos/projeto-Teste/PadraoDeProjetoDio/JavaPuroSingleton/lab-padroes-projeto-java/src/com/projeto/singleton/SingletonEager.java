package com.projeto.singleton;

/**
 * Singleton Apressado
 * @author aguia
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){

    }
    public static SingletonEager getInstancia() {
      return instancia;
    }
}
