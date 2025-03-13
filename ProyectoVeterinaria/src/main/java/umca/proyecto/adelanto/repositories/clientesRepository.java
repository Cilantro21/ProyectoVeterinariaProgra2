package umca.proyecto.adelanto.repositories;



import org.springframework.data.repository.CrudRepository;

import umca.proyecto.adelanto.entities.clientesEntity;

public interface clientesRepository extends CrudRepository<clientesEntity, Integer>{


    void deleteById(Integer Id);

    


}
