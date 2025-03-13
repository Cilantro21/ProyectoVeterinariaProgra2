package umca.proyecto.adelanto.repositories;

import org.springframework.data.repository.CrudRepository;

import umca.proyecto.adelanto.entities.razaEntity;

public interface razaRepository extends CrudRepository<razaEntity, Integer>{

    void deleteById(Integer Id);

}
