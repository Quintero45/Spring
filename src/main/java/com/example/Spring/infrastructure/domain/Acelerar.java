package com.example.Spring.infrastructure.domain;

public interface Acelerar {
    default public void acelerarVehiculo(){
        System.out.println("Acelenrando el vehículo.");
    }
}
