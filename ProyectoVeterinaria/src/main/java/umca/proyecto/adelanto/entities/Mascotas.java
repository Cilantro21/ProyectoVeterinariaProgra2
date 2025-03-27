package umca.proyecto.adelanto.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "MASCOTAS", schema = "dbo")
public class Mascotas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Size(max = 10)
    private String nombre;

    @Size(max = 10)
    private String fecha_nacimiento;

    @Size(max = 10)
    private String color;

    //@Size(max = 3)
    private Integer peso;

    //@Size(max = 2)
    private Integer tamanio;

    public Mascotas() {
    }

    public Mascotas(Integer id, @Size(max = 10) String nombre, @Size(max = 10) String fecha_nacimiento,
            @Size(max = 10) String color, Integer peso, Integer tamanio) {
        this.id = id;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.color = color;
        this.peso = peso;
        this.tamanio = tamanio;
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

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }
    
}
