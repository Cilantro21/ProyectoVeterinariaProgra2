package umca.proyecto.adelanto.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "ROLES")
public class Roles {

    @Id
    private Integer id;

    @Size(max = 10)
    private String nombre_rol;

    public Roles() {
    }

    public Roles(Integer id, @Size(max = 10) String nombre_rol) {
        this.id = id;
        this.nombre_rol = nombre_rol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre_rol() {
        return nombre_rol;
    }

    public void setNombre_rol(String nombre_rol) {
        this.nombre_rol = nombre_rol;
    }

    
   
}
