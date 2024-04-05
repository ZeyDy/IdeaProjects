package lt.javau9.carx.mapper;

import lt.javau9.carx.dto.CarDTO;
import lt.javau9.carx.modes.Car;

public class CarMapper {
    public static CarDTO mapToCarDTO(Car car) {
        return new CarDTO(
                car.getId(),
                car.getPlateNumber(),
                car.getMake(),
                car.getModel()

        );
    }

    public  static Car mapToCar(CarDTO carDTO) {
        return  new Car(
                carDTO.getId(),
                carDTO.getPlateNumber(),
                carDTO.getMake(),
                carDTO.getModel()
        );
    }
}
