package umca.proyecto.adelanto.repositories;

import org.springframework.data.repository.CrudRepository;
import umca.proyecto.adelanto.entities.mascotasEntity;

public interface mascotasRepository extends CrudRepository<mascotasEntity, Integer>{

    void deleteById(Integer Id);

}
