package codeAcademy.carxxx.services.impl;

import codeAcademy.carxxx.dto.CarDTO;
import codeAcademy.carxxx.exceptions.RecourseNotFoundException;
import codeAcademy.carxxx.mapper.CarMapper;
import codeAcademy.carxxx.modes.Car;
import codeAcademy.carxxx.repositories.CarRepository;
import codeAcademy.carxxx.services.CarService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class CarServiceImpl implements CarService {
    private CarRepository carRepository;
    @Override
    public CarDTO createCar(CarDTO carDTO) {
        Car car = CarMapper.mapToCar(carDTO);
        Car savedCar = carRepository.save(car);
        return CarMapper.mapToCarDTO(savedCar);
    }

    @Override
    public CarDTO getCarById(Long carId) {
        Car car = carRepository.findById(carId)
                .orElseThrow(() -> new RecourseNotFoundException("Car is not exists"));
        return CarMapper.mapToCarDTO(car);
    }

    @Override
    public List<CarDTO> getAllCars() {
        List<Car> cars =  carRepository.findAll();
        return cars.stream().map((car) -> CarMapper.mapToCarDTO(car))
                .collect(Collectors.toList());
    }

    @Override
    public CarDTO updateCar(Long carId, CarDTO updatedCar) {
        Car car = carRepository.findById(carId).orElseThrow(
                () -> new RuntimeException("Car is not exists")
        );
        car.setPlateNumber(updatedCar.getPlateNumber());
        car.setMake(updatedCar.getMake());
        car.setModel(updatedCar.getModel());
        Car updatedCarObj =  carRepository.save(car);
        return CarMapper.mapToCarDTO(updatedCarObj);
    }

    @Override
    public void deleteCar(Long carId) {
        Car car = carRepository.findById(carId).orElseThrow(
                () -> new RuntimeException("Car is not exists")
        );
        carRepository.deleteById(carId);

    }

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
}
