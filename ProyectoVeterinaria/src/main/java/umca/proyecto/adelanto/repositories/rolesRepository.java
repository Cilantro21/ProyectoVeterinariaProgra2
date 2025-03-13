package umca.proyecto.adelanto.repositories;

import org.springframework.data.repository.CrudRepository;

import umca.proyecto.adelanto.entities.rolesEntity;
import umca.proyecto.adelanto.entities.usuariosEntity;

public interface rolesRepository extends CrudRepository<rolesEntity, Integer>{

    usuariosEntity findByUsuario(String usuario);

}
