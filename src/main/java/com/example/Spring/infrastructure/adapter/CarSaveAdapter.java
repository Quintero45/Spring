package com.example.Spring.infrastructure.adapter;

import com.example.Spring.infrastructure.domain.Carro;
import com.example.Spring.infrastructure.domain.service.CarSaveService;
import com.example.Spring.infrastructure.dto.CarroDto;
import com.example.Spring.infrastructure.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarSaveAdapter implements CarSaveService {

  private final CarRepository carRepository;

  @Override
  public Carro save(Carro carro) {
    return buildCarro(carRepository.save(buildCarroDto(carro)));
  }

  private CarroDto buildCarroDto(Carro carro) {
    return new CarroDto(carro.getMarca(), carro.getPlaca(), carro.getModelo(), carro.getPrecio(), carro.getColor());
  }

  private Carro buildCarro(CarroDto carro) {
    return new Carro(carro.getMarca(), carro.getPlaca(), carro.getModelo(), carro.getPrecio(),
        carro.getColor());
  }
}
