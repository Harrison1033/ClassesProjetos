package com.javapuro.strategy;

public class Main {
    public static void main(String[] args) {
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefencivo();
        Comportamento agrissivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(agrissivo);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.mover();
    }
}