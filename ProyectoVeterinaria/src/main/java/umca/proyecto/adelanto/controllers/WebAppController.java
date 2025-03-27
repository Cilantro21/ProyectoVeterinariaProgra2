package umca.proyecto.adelanto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/webapp")
public class WebAppController {
    @GetMapping("/")
    public String inicio() {
        return "webapp/inicio";
    }
    
    @GetMapping("/citas")
    public String citas() {
        return "webapp/citas";
    }
}
