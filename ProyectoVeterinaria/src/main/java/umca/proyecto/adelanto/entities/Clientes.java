package umca.proyecto.adelanto.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "CLIENTES", schema = "dbo")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Size(min = 9, max = 9)
    private String identificacion;

    @Size(max = 50)
    private String nombre;

    @Size(max = 50)
    private String apellidos;

    @Size(min = 10)
    private Date fecha_nacimiento;

    @Size(min = 2)
    private String edad;

    @Size(min = 15)
    private String email;

    @Size(max = 8)
    private String telefono;


    public Clientes() {
    }


    public Clientes(Integer id, @Size(min = 9, max = 9) String identificacion, @Size(max = 50) String nombre,
            @Size(max = 50) String apellidos, @Size(min = 10) Date fecha_nacimiento, @Size(min = 2) String edad,
            @Size(min = 15) String email, @Size(max = 8) String telefono) {
        this.id = id;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getIdentificacion() {
        return identificacion;
    }


    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
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


    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }


    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }


    public String getEdad() {
        return edad;
    }


    public void setEdad(String edad) {
        this.edad = edad;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
}
