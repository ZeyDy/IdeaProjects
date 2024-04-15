package codeAcademy.carxxx.dto;

public class CarDTO {
    private Long id;
    private String plateNumber;
    private String make;
    private String model;
    public CarDTO() {}

    public CarDTO(Long id, String plateNumber, String make, String model) {
        this.id = id;
        this.plateNumber = plateNumber;
        this.make = make;
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
