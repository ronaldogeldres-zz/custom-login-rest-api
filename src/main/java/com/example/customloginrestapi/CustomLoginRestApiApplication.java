package com.example.customloginrestapi;

import com.example.customloginrestapi.domain.Car;
import com.example.customloginrestapi.domain.Role;
import com.example.customloginrestapi.domain.User;
import com.example.customloginrestapi.repository.CarRepository;
import com.example.customloginrestapi.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.UUID;

@SpringBootApplication
public class CustomLoginRestApiApplication implements CommandLineRunner {

    private RoleRepository roleRepository;
    private CarRepository carRepository;
    private BCryptPasswordEncoder encoder;

    public CustomLoginRestApiApplication(RoleRepository roleRepository, CarRepository carRepository, BCryptPasswordEncoder encoder) {
        this.roleRepository = roleRepository;
        this.carRepository = carRepository;
        this.encoder = encoder;
    }

    public static void main(String[] args) {
        SpringApplication.run(CustomLoginRestApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        for (int i = 0; i < 10; i++) {
            Car car = new Car();
            car.setDescription(UUID.randomUUID().toString());
            carRepository.save(car);
        }

        User user = new User();
        user.setUsername("admin");
        user.setPassword(encoder.encode("12345"));
        user.setEnabled(true);
        Role role = new Role();
        role.setUser(user);
        role.setDescription("ROLE_ADMIN");
        roleRepository.save(role);
    }
}
