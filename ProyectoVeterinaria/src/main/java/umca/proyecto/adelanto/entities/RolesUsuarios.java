package umca.proyecto.adelanto.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ROLESUSUARIOS")
public class RolesUsuarios {

    @Id
    private Integer id;

    private Integer fk_rol;

    private Integer fk_usuario;

    public RolesUsuarios() {
    }

    public RolesUsuarios(Integer id, Integer fk_rol, Integer fk_usuario) {
        this.id = id;
        this.fk_rol = fk_rol;
        this.fk_usuario = fk_usuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFk_rol() {
        return fk_rol;
    }

    public void setFk_rol(Integer fk_rol) {
        this.fk_rol = fk_rol;
    }

    public Integer getFk_usuario() {
        return fk_usuario;
    }

    public void setFk_usuario(Integer fk_usuario) {
        this.fk_usuario = fk_usuario;
    }

    
}
