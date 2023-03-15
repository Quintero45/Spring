package com.example.Spring.infrastructure.api.controller;

import com.example.Spring.application.CarSave;
import com.example.Spring.infrastructure.domain.Carro;
import com.example.Spring.infrastructure.domain.service.CarGetService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@AllArgsConstructor
@RestController
@RequestMapping(path = "/car")
public class CarController {


  private final CarSave carSave;
  private final CarGetService carGetService;
  @GetMapping
  public ResponseEntity<Carro> getCar(@RequestParam String placa){
    return ResponseEntity.ok(carGetService.get(placa));

  }

  @PostMapping
  public ResponseEntity<Carro> addCar(@RequestBody Carro car){
    return new ResponseEntity<>(carSave.saveCar(car), HttpStatus.CREATED);
  }

}
