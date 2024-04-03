package javau9.biudzetasv2.services;

import javau9.biudzetasv2.models.Biudzetas;
import javau9.biudzetasv2.repositories.BiudzetasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BiudzetasService {
    @Autowired
    private BiudzetasRepository biudzetasRepository;

    public List<Biudzetas> gautiVisusBiudzetus() {
        return biudzetasRepository.findAll();
    }

    public Biudzetas gautiBiudzetaPagalId(Long id) {
        return biudzetasRepository.findById(id).orElse(null);
    }

    public void pridetiArbaAtnaujintiBiudzeta(Biudzetas biudzetas) {
        biudzetasRepository.save(biudzetas);
    }

    public void istrintiBiudzeta(Long id) {
        biudzetasRepository.deleteById(id);
    }
    public Double biudzetoSuma() {
        return biudzetasRepository.getBiudzetoSuma();
    }
}