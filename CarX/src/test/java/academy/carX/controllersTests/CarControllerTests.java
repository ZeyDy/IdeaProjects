package academy.carX.controllersTests;

import academy.carX.controllers.CarController;
import academy.carX.dto.CarDTO;
import academy.carX.services.CarService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.doNothing;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
class CarControllerTest {

    private MockMvc mockMvc;

    @Mock
    private CarService carService;

    @InjectMocks
    private CarController carController;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(carController).build();
    }

    @Test
    void createCarTest() throws Exception {
        CarDTO carDTO = new CarDTO(); // Pradinė DTO versija
        CarDTO savedCar = new CarDTO(); // DTO versija, ką tikimasi grąžinti iš serviso
        String username = "testVartotojas"; // Pradinė vartotojo vardo versija

        given(carService.createCar(any(CarDTO.class), eq(username))).willReturn(savedCar);

        mockMvc.perform(post("/api/createcar")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(carDTO))
                        .header("Authorization", "Bearer {token}")) // Priklauso nuo to, kaip mockinate autentifikaciją
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(savedCar.getId())); // Priklauso nuo to, ką tiksliai grąžina jūsų metodas
    }

    @Test
    void getCarByIdTest() throws Exception {
        Long carId = 1L;
        CarDTO carDTO = new CarDTO();
        given(carService.getCarById(carId)).willReturn(carDTO);

        mockMvc.perform(get("/api/{id}", carId))
                .andExpect(status().isOk())
                .andExpect(content().json(objectMapper.writeValueAsString(carDTO)));
    }

    @Test
    void getAllCarsTest() throws Exception {
        List<CarDTO> cars = Arrays.asList(new CarDTO(), new CarDTO());
        given(carService.getAllCars()).willReturn(cars);

        mockMvc.perform(get("/api/allcars"))
                .andExpect(status().isOk())
                .andExpect(content().json(objectMapper.writeValueAsString(cars)));
    }

    @Test
    void updateCarTest() throws Exception {
        Long carId = 1L;
        CarDTO updatedCar = new CarDTO(); // Naujos savybės
        CarDTO carDTO = new CarDTO(); // Kaip tikimasi grąžinti iš serviso
        given(carService.updateCar(eq(carId), any(CarDTO.class))).willReturn(carDTO);

        mockMvc.perform(put("/api/update/{id}", carId)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(updatedCar)))
                .andExpect(status().isOk())
                .andExpect(content().json(objectMapper.writeValueAsString(carDTO)));
    }

    @Test
    void deleteCarTest() throws Exception {
        Long carId = 1L;
        doNothing().when(carService).deleteCar(carId);

        mockMvc.perform(delete("/api/delete/{id}", carId))
                .andExpect(status().isOk())
                .andExpect(content().string("Car deleted"));
    }
}
