package umca.proyecto.adelanto.middlewares;

import org.springframework.beans.factory.annotation.Autowired;

import umca.proyecto.adelanto.entities.usuariosEntity;
import umca.proyecto.adelanto.repositories.rolesRepository;

public class autenticadorPaginas {
    @Autowired
    private rolesRepository _repositorio;

    public boolean autenticarAdministrador(String usuario){
        // usuariosEntity roles = _repositorio.findByUsuario(usuario);
        // return usuario.getRoles().equals("Administrador");
        return false;
    }
}
