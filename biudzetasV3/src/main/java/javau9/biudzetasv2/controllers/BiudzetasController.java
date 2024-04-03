package javau9.biudzetasv2.controllers;

import javau9.biudzetasv2.models.Biudzetas;
import javau9.biudzetasv2.services.BiudzetasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BiudzetasController {
    @Autowired
    private BiudzetasService biudzetasService;

    @GetMapping("/")
    public String gautiVisusBiudzetus(Model model) {
        List<Biudzetas> biudzetai = biudzetasService.gautiVisusBiudzetus();
        model.addAttribute("biudzetai", biudzetai);
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
}
