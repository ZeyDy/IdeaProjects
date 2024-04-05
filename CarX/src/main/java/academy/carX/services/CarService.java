package academy.carX.services;



import academy.carX.dto.CarDTO;

import java.util.List;


public interface CarService {

    CarDTO createCar(CarDTO carDTO);

    CarDTO getCarById(Long carId);

    List<CarDTO> getAllCars();

    CarDTO updateCar(Long carId, CarDTO updatedCar);

    void deleteCar(Long carId);

}
