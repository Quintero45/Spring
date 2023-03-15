package com.example.Spring.application;

import com.example.Spring.infrastructure.domain.Carro;
import com.example.Spring.infrastructure.domain.service.CarGetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class CarGet {

  private final CarGetService carGetService;

  public Carro getCar(String placa){
    return carGetService.get(placa);

  }

}
