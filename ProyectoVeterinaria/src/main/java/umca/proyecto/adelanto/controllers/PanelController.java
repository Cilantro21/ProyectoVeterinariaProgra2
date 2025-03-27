package umca.proyecto.adelanto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/webapp/panel")
public class PanelController {
    @GetMapping("/")
    public String home() {
        return "webapp/panel/home";
    }
    
    @GetMapping("/cerrar")
    public String cerrar() {
        return "webapp/inicio";
    }

    @GetMapping("/ingresar")
    public String ingresar() {
        return "webapp/panel/ingresar";
    }

    @GetMapping("/mascotas")
    public String mascotas() {
        return "webapp/panel/mascotas";
    }

    @GetMapping("/clientes")
    public String clientes() {
        return "webapp/panel/clientes";
    }

    @GetMapping("/usuarios")
    public String usuarios() {
        return "webapp/panel/usuarios";
    }

}
