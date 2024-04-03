package javau9.biudzetasv2.controllers;

import javau9.biudzetasv2.models.Biudzetas;
import javau9.biudzetasv2.models.Islaidos;
import javau9.biudzetasv2.services.BiudzetasService;
import javau9.biudzetasv2.services.IslaidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Controller
public class IslaidosController {
    @Autowired
    private IslaidosService islaidosService;

    @GetMapping("/visosislaidos")
    public String gautiVisasIslaidas(Model model) {
        List<Islaidos> islaidos = islaidosService.gautiVisasIslaidas();
        model.addAttribute("islaidos", islaidos);
        return "islaidos_sarasas";
    }

    @GetMapping("/sukurtiislaidas")
    public String rodytiIslaiduKurimoForma(Model model) {
        model.addAttribute("islaidos", new Islaidos());
        return "islaidos_forma";
    }

    @PostMapping("/pridetiislaidos")
    public String pridetiIslaidos(@ModelAttribute("islaidos") Islaidos islaidos) {
        islaidosService.pridetiArbaAtnaujintiIslaidas(islaidos);
        return "redirect:/";
    }

    @GetMapping("/redaguotiislaidos/{id}")
    public String rodytiIslaidosRedagavimoForma(@PathVariable("id") Long id, Model model) {
        Islaidos islaidos = islaidosService.gautiIslaidasPagalId(id);
        model.addAttribute("islaidos", islaidos);
        return "islaidos_forma";
    }

    @GetMapping("/istrintiislaidos/{id}")
    public String istrintiIslaidos(@PathVariable("id") Long id) {
        islaidosService.istrintiIslaida(id);
        return "redirect:/";
    }
}

