package com.example.Spring.infrastructure.domain;

public interface Frenar
{
    default public void frenar(){
        System.out.println("Frenando el Vehículo.");
    }

}
