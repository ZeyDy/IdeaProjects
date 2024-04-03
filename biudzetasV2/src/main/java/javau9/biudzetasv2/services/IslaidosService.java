package javau9.biudzetasv2.services;

import javau9.biudzetasv2.models.Biudzetas;
import javau9.biudzetasv2.models.Islaidos;
import javau9.biudzetasv2.repositories.IslaidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IslaidosService {
    @Autowired
    private IslaidosRepository islaidosRepository;
    public List<Islaidos> gautiVisasIslaidas() {return islaidosRepository.findAll();}
    public Islaidos gautiIslaidasPagalId(Long id) {
        return islaidosRepository.findById(id).orElse(null);
    }

    public void pridetiArbaAtnaujintiIslaidas(Islaidos islaidos) {
        islaidosRepository.save(islaidos);
    }

    public void istrintiIslaida(Long id) {
        islaidosRepository.deleteById(id);
    }
}
