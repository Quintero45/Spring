package com.example.Spring.infrastructure.repository;

import com.example.Spring.infrastructure.dto.CarroDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarroDto, String> {

}
