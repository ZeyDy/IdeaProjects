package academy.carX.controllers;


import academy.carX.dto.CarDTO;
import academy.carX.services.CarService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.security.Principal;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@CrossOrigin
@RestController
@RequestMapping("/api")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping("/createcar")
    public ResponseEntity<CarDTO> createCar(@RequestBody CarDTO carDTO, Principal principal) {
        String username = principal.getName();
        CarDTO savedCar = carService.createCar(carDTO, username);
        return new ResponseEntity<>(savedCar, HttpStatus.CREATED);
    }


    @GetMapping("{id}")
    public ResponseEntity<CarDTO> getCarById(@PathVariable("id") Long carId) {
        CarDTO carDTO = carService.getCarById(carId);
        return ResponseEntity.ok(carDTO);
    }
//    @GetMapping("/allcars")
//    public ResponseEntity<List<CarDTO>> getAllCars() {
//        List<CarDTO> cars = carService.getAllCars();
//        return ResponseEntity.ok(cars);
//    }

    @PutMapping("/update/{id}")
    public  ResponseEntity<CarDTO> updateCar(@PathVariable("id") Long carId,@RequestBody CarDTO updatedCar) {
        CarDTO carDTO = carService.updateCar(carId, updatedCar);
        return ResponseEntity.ok(carDTO);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteCar(@PathVariable("id") Long carId) {
        carService.deleteCar(carId);
        return ResponseEntity.ok("Car deleted");
    }

    // nauji

    @GetMapping("/mycars")
    public ResponseEntity<List<CarDTO>> getMyCars(Principal principal) {
        String username = principal.getName();
        List<CarDTO> cars = carService.getCarsByOwner(username);
        return ResponseEntity.ok(cars);
    }


}
