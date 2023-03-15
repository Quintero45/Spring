package com.example.Spring.infrastructure.adapter;

import com.example.Spring.infrastructure.domain.Carro;
import com.example.Spring.infrastructure.domain.service.CarGetService;
import com.example.Spring.infrastructure.dto.CarroDto;
import com.example.Spring.infrastructure.repository.CarRepository;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarGetAdapter implements CarGetService {

  private final CarRepository carRepository;

  @Override
  public Carro get(String placa) {
    Optional<CarroDto> carroDto = carRepository.findById(placa);
    if (carroDto.isEmpty()) {
      return null;
    }
    return buildCarro(carroDto.get());
  }

  private CarroDto getCarro(Carro carro) {
    return new CarroDto(carro.getMarca(), carro.getPlaca(), carro.getModelo(), carro.getPrecio(),
        carro.getColor());
  }

  private Carro buildCarro(CarroDto carro) {
    return new Carro(carro.getMarca(), carro.getPlaca(), carro.getModelo(), carro.getPrecio(),
        carro.getColor());
  }
}

