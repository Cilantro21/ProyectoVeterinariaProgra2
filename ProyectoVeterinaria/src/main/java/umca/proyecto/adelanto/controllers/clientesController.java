package umca.proyecto.adelanto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.transaction.Transactional;
import umca.proyecto.adelanto.entities.clientesEntity;
import umca.proyecto.adelanto.repositories.clientesRepository;

@Controller
public class clientesController {

    @Autowired

    private clientesRepository clienteRepo;

    @GetMapping("/menuCliente")
    public String menuCliente(){

        return "moduloCliente/menuCliente";
    }

    @GetMapping("/menuCliente/registrar")
    public String registrarCliente(@ModelAttribute("clientes") clientesEntity clientes){

        return "moduloCliente/registrarCliente";
    }

    @PostMapping("/menuCliente/registrar")

    public String salvarCliente(clientesEntity clientes){

        clienteRepo.save(clientes);

        return "moduloCliente/menuCliente";
    }

    @GetMapping("/menuCliente/consultar")

    public String consultarCliente(Model model){

        Iterable<clientesEntity> listaClientes = clienteRepo.findAll();
        model.addAttribute("clientes", listaClientes);

        return "moduloCliente/consultarCliente";
    }

    
    @GetMapping("/menuCliente/eliminar")
    public String eliminarCliente(@ModelAttribute("clientes") clientesEntity clientes){

        return "moduloCliente/eliminarCliente";
    }

    @PostMapping("/menuCliente/eliminar")
    @Transactional
    public String eliminarCliente(@RequestParam("Id") Integer Id, Model model) {
    
        if (clienteRepo.existsById(Id)) {
            clienteRepo.deleteById(Id);
            model.addAttribute("message", "El cliente de ID " + Id + " ha sido eliminado.");
        } else {
            model.addAttribute("error", "ID no encontrado.");
        }
    
        return "moduloCliente/menuCliente";
    }
    
}
    



