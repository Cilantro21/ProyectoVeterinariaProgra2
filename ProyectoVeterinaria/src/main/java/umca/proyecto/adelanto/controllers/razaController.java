package umca.proyecto.adelanto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.transaction.Transactional;
import umca.proyecto.adelanto.entities.razaEntity;
import umca.proyecto.adelanto.repositories.razaRepository;

@Controller
public class razaController {

    @Autowired

    private razaRepository razaRepo;

    @GetMapping("/menuRaza")
    public String menuRaza(){

        return "moduloRaza/menuRaza";
    }

    @GetMapping("/menuRaza/registrar")
    public String registrarRaza(@ModelAttribute("razas") razaEntity razas){

        return "moduloRaza/registrarRaza";
    }

    @PostMapping("/menuRaza/registrar")

    public String salvarRaza(razaEntity razas){

        razaRepo.save(razas);

        return "moduloRaza/menuRaza";
    }

    @GetMapping("/menuRaza/consultar")

    public String consultarRaza(Model model){

        Iterable<razaEntity> listaRazas = razaRepo.findAll();
        model.addAttribute("razas", listaRazas);

        return "moduloRaza/consultarRaza";
    }

    
    @GetMapping("/menuRaza/eliminar")
    public String eliminarMascota(@ModelAttribute("razas") razaEntity razas){

        return "moduloRaza/eliminarRaza";
    }

    @PostMapping("/menuRaza/eliminar")
    @Transactional
    public String eliminarMascota(@RequestParam("Id") Integer Id, Model model) {
    
        if (razaRepo.existsById(Id)) {
            razaRepo.deleteById(Id);
            model.addAttribute("message", "La raza de ID" + Id + " ha sido eliminada.");
        } else {
            model.addAttribute("error", "El ID no ha sido encontrado.");
        }
    
        return "moduloRaza/menuRaza";
    }

}
