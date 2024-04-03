package javau9.biudzetasv2.controllers;

import javau9.biudzetasv2.models.Biudzetas;
import javau9.biudzetasv2.models.Islaidos;
import javau9.biudzetasv2.services.BiudzetasService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BiudzetasController {
    Logger logger = LoggerFactory.getLogger(BiudzetasController.class);

    @Autowired
    private BiudzetasService biudzetasService;
    @GetMapping("/")
    public  String pagrindinis() {
        return "index";
    }

    @GetMapping("/visi")
    public String gautiVisusBiudzetus(Model model) {
        List<Biudzetas> biudzetai = biudzetasService.gautiVisusBiudzetus();
        model.addAttribute("biudzetai", biudzetai);
        logger.debug("bug");
        return "biudzeto_sarasas";
    }

    @GetMapping("/sukurti")
    public String rodytiBiudzetoKurimoForma(Model model) {
        model.addAttribute("biudzetas", new Biudzetas());
        return "biudzeto_forma";
    }

    @PostMapping("/prideti")
    public String pridetiBiudzeta(@ModelAttribute("biudzetas") Biudzetas biudzetas) {
        biudzetasService.pridetiArbaAtnaujintiBiudzeta(biudzetas);
        return "redirect:/";
    }

    @GetMapping("/redaguoti/{id}")
    public String rodytiBiudzetoRedagavimoForma(@PathVariable("id") Long id, Model model) {
        Biudzetas biudzetas = biudzetasService.gautiBiudzetaPagalId(id);
        model.addAttribute("biudzetas", biudzetas);
        return "biudzeto_forma";
    }

    @GetMapping("/istrinti/{id}")
    public String istrintiBiudzeta(@PathVariable("id") Long id) {
        biudzetasService.istrintiBiudzeta(id);
        return "redirect:/";
    }
    @GetMapping("/biudzetas")
    public String getBiudzetasPage(Model model) {
        Double biudzetoSuma = biudzetasService.biudzetoSuma();
        model.addAttribute("biudzetoSuma", biudzetoSuma);
        return "biudzetas";
    }
}
