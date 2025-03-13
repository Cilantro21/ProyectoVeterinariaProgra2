package umca.proyecto.adelanto.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rolesUsuarios")
public class rolesUsuariosEntity {

    @Id
    private Integer id;

    private Integer fkRol;

    private Integer fkUsuario;

    public rolesUsuariosEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFkRol() {
        return fkRol;
    }

    public void setFkRol(Integer fkRol) {
        this.fkRol = fkRol;
    }

    public Integer getFkUsuario() {
        return fkUsuario;
    }

    public void setFkUsuario(Integer fkUsuario) {
        this.fkUsuario = fkUsuario;
    }

    

}
