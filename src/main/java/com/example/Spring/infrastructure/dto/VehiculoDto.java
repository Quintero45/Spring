package com.example.Spring.infrastructure.dto;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@MappedSuperclass
public class VehiculoDto {
    @Id
    private  String placa;
    private  String marca;
    private  String modelo;
    private  Double precio;
}