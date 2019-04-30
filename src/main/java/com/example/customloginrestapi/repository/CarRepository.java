package com.example.customloginrestapi.repository;

import com.example.customloginrestapi.domain.Car;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {

    @Query("select c from cars c")
    public List<Car> getAll();
}
