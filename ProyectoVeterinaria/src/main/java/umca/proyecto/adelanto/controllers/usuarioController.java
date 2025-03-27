package umca.proyecto.adelanto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.transaction.Transactional;
import umca.proyecto.adelanto.entities.usuariosEntity;
import umca.proyecto.adelanto.middlewares.autenticadorPaginas;
import umca.proyecto.adelanto.repositories.usuariosRepository;

@Controller
public class usuarioController {

    @Autowired
    private usuariosRepository usuarioRepo;

    @GetMapping("/menuUsuario")
    public String menuUsuario(){

        return "moduloUsuario/menuUsuario";
    }

    @GetMapping("/menuUsuario/registrar")
    public String registrarUsuario(@ModelAttribute("usuarios") usuariosEntity usuarios){

        return "moduloUsuario/registrarUsuario";
    }

    @PostMapping("/menuUsuario/registrar")

    public String salvarUsuario(usuariosEntity usuarios){
        // autenticadorPaginas autenticador = new autenticadorPaginas();
        // if(autenticador.autenticarAdministrador(usuarioRegistro)){
        //     usuarioRepo.save(usuarios);
        //     return "moduloUsuario/menuUsuario";
        // }else{
        //     modelo.addAttribute("error", "No tiene permisos para realizar esta acción.");
        //     return "moduloUsuario/menuUsuario";
        // }
        return "moduloUsuario/menuUsuario";
        
    }

    @GetMapping("/menuUsuario/consultar")

    public String consultarUsuario(Model model){

        Iterable<usuariosEntity> listaUsuarios = usuarioRepo.findAll();
        model.addAttribute("usuarios", listaUsuarios);

        return "moduloUsuario/consultarUsuario";
    }

    
    @GetMapping("/menuUsuario/eliminar")
    public String eliminarUsuario(@ModelAttribute("usuario") usuariosEntity usuarios){

        return "moduloUsuario/eliminarUsuario";
    }

    @PostMapping("/menuUsuario/eliminar")
    @Transactional
    public String eliminarUsuario(@RequestParam("Id") Integer Id, Model model) {
    
        if (usuarioRepo.existsById(Id)) {
            usuarioRepo.deleteById(Id);
            model.addAttribute("message", "El usuario de ID " + Id + " ha sido eliminado.");
        } else {
            model.addAttribute("error", "ID no encontrado.");
        }
    
        return "moduloUsuario/menuUsuario";
    }

}
