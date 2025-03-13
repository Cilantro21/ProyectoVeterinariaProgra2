package umca.proyecto.adelanto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginController {

    @GetMapping({"","/","/login"})
    public String loginPage() {
        return "moduloUsuario/login";  
    }

}
