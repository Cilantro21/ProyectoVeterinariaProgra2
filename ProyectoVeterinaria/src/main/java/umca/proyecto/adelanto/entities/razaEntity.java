package umca.proyecto.adelanto.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "razas", schema = "dbo")
public class razaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Size(max = 30)
    private String nombre;

    @Size(min = 10, max = 50)
    private String datosAuditoria;

    public razaEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDatosAuditoria() {
        return datosAuditoria;
    }

    public void setDatosAuditoria(String datosAuditoria) {
        this.datosAuditoria = datosAuditoria;
    }

    


}
