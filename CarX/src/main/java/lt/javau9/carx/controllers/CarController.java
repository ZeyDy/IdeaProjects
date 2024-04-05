package lt.javau9.carx.controllers;

import lt.javau9.carx.dto.CarDTO;
import lt.javau9.carx.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class CarController {
    @Autowired
    private CarService carService;
    @PostMapping
    public ResponseEntity<CarDTO> createCar(@RequestBody CarDTO carDTO) {
        CarDTO savedCar = carService.createCar(carDTO);
        return  new ResponseEntity<>(savedCar, HttpStatus.CREATED);
    }



}
