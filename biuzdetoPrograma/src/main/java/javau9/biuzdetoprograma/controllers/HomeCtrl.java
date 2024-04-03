package javau9.biuzdetoprograma.controllers;

import javau9.biuzdetoprograma.models.Islaidos;
import javau9.biuzdetoprograma.models.Pajamos;
import javau9.biuzdetoprograma.repositories.IslaiduRep;
import javau9.biuzdetoprograma.repositories.PajamuRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeCtrl {
    @Autowired
    private IslaiduRep islaiduRep;
    @Autowired
    private PajamuRep pajamuRep;

    @PostMapping("/pridetipajamas")
    @ResponseBody
    public String pridetipajamas(@RequestParam Double suma,
                                 @RequestParam String data,
                                 @RequestParam String kategorija,
                                 @RequestParam String paskirtis) {
        // Sukurkite naują vartotojo objektą su gautais parametrais
        Pajamos pajamos = new Pajamos();
        pajamos.setSuma(suma);
        pajamos.setData(data);
        pajamos.setKategorija(kategorija);
        pajamos.setPaskirtis(paskirtis);

        // Išsaugokite vartotoją į duomenų bazę naudojant UserRepository
        pajamuRep.save(pajamos);

        // Grąžinkite atsakymą klientui
        return "forward:/islaiduforma.html";
    }

    @PostMapping("/pridetiislaidas")
    @ResponseBody
    public String pridetiislaidas(@RequestParam Double suma,
                                 @RequestParam String data,
                                 @RequestParam String kategorija,
                                 @RequestParam String atsiskaitymoBudas) {
        // Sukurkite naują vartotojo objektą su gautais parametrais
        Islaidos islaidos = new Islaidos();
        islaidos.setSuma(suma);
        islaidos.setData(data);
        islaidos.setKategorija(kategorija);
        islaidos.setAtsiskaitymoBudas(atsiskaitymoBudas);

        // Išsaugokite vartotoją į duomenų bazę naudojant UserRepository
        islaiduRep.save(islaidos);

        // Grąžinkite atsakymą klientui
        return "Pajamos pridetos!";
    }

}
