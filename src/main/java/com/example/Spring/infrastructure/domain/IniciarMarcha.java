package com.example.Spring.infrastructure.domain;

public interface IniciarMarcha {
    default public void iniciarMarcha(){
        System.out.println("Iniciando marcha");
    }
}
