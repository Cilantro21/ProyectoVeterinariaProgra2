package umca.proyecto.adelanto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.transaction.Transactional;
import umca.proyecto.adelanto.entities.mascotasEntity;
import umca.proyecto.adelanto.repositories.mascotasRepository;


@Controller
public class mascotasController {

     @Autowired

    private mascotasRepository mascotaRepo;

    @GetMapping("/menuMascota")
    public String menuCliente(){

        return "moduloMascota/menuMascota";
    }

    @GetMapping("/menuMascota/registrar")
    public String registrarMascota(@ModelAttribute("mascotas") mascotasEntity mascotas){

        return "moduloMascota/registrarMascota";
    }

    @PostMapping("/menuMascota/registrar")

    public String salvarMascota(mascotasEntity mascotas){

        mascotaRepo.save(mascotas);

        return "moduloMascota/menuMascota";
    }

    @GetMapping("/menuMascota/consultar")

    public String consultarMascota(Model model){

        Iterable<mascotasEntity> listaMascotas = mascotaRepo.findAll();
        model.addAttribute("mascotas", listaMascotas);

        return "moduloMascota/consultarMascota";
    }

    
    @GetMapping("/menuMascota/eliminar")
    public String eliminarMascota(@ModelAttribute("mascotas") mascotasEntity mascotas){

        return "moduloMascota/eliminarMascota";
    }

    @PostMapping("/menuMascota/eliminar")
    @Transactional
    public String eliminarMascota(@RequestParam("Id") Integer Id, Model model) {
    
        if (mascotaRepo.existsById(Id)) {
            mascotaRepo.deleteById(Id);
            model.addAttribute("message", "La mascota de ID" + Id + " ha sido eliminada.");
        } else {
            model.addAttribute("error", "El ID no ha sido encontrado.");
        }
    
        return "moduloMascota/menuMascota";
    }

}
