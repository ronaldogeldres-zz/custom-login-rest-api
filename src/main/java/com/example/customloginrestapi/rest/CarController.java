package com.example.customloginrestapi.rest;

import com.example.customloginrestapi.domain.Car;
import com.example.customloginrestapi.repository.CarRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    private CarRepository carRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping(path = "/cars")
    public List<Car> getAll(){
        return carRepository.getAll();
    }
}
