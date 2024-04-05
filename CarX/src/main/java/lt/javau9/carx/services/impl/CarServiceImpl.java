package lt.javau9.carx.services.impl;

import lt.javau9.carx.dto.CarDTO;
import lt.javau9.carx.mapper.CarMapper;
import lt.javau9.carx.modes.Car;
import lt.javau9.carx.repositories.CarRepository;
import lt.javau9.carx.services.CarService;
import org.springframework.stereotype.Service;


@Service
public class CarServiceImpl implements CarService {
    private CarRepository carRepository;
    @Override
    public CarDTO createCar(CarDTO carDTO) {
        Car car = CarMapper.mapToCar(carDTO);
        Car savedCar = carRepository.save(car);
        return CarMapper.mapToCarDTO(savedCar);
    }

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
}
