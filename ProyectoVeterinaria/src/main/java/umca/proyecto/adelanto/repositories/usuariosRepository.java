package umca.proyecto.adelanto.repositories;

import org.springframework.data.repository.CrudRepository;

import umca.proyecto.adelanto.entities.usuariosEntity;

public interface usuariosRepository extends CrudRepository<usuariosEntity, Integer>{

    void deleteById(Integer Id);

}
