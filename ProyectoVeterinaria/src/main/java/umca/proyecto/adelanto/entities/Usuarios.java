package umca.proyecto.adelanto.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "USUARIOS")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Size(max = 50)
    private String nombre;

    @Size(max = 50)
    private String apellidos;

    @Size(max = 50)
    private String nombre_usuario;

    @Size(min = 12)
    private String contrasena;
  
    private boolean estado;

    public Usuarios() {
    }

    public Usuarios(Integer id, @Size(max = 50) String nombre, @Size(max = 50) String apellidos,
            @Size(max = 50) String nombre_usuario, @Size(min = 12) String contrasena, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nombre_usuario = nombre_usuario;
        this.contrasena = contrasena;
        this.estado = estado;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
}
