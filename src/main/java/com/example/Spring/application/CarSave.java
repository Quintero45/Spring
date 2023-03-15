package com.example.Spring.application;

import com.example.Spring.infrastructure.domain.Carro;
import com.example.Spring.infrastructure.domain.service.CarSaveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class CarSave {

  private final CarSaveService carSaveService;


  public Carro saveCar(Carro carro){
    return carSaveService.save(carro);
  }

}
