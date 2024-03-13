package com.exemploapi.testando.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeController {
    private String nome = "Harrison de Oliveira";

    @GetMapping
    public String welcome(){
        return "Bem vindo ao meu Srping Boot Web Api " + nome;
    }

}
