package umca.proyecto.adelanto.repositories;



import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import umca.proyecto.adelanto.entities.clientesEntity;

public interface clientesRepository extends CrudRepository<clientesEntity, Integer>{


    void deleteById(Integer Id);

    Optional<clientesEntity> findById(Long id);


}
