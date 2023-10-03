package co.edu.uniquindio.proyectofinal.proyectofinal.Model;

import java.util.Date;

public abstract class Persona {

    private String nombre;
    private String apellido;
    private String identificación;
    private String fechaNac;
    public Persona(){};

    public Persona(String nombre, String apellido, String identificación, String fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificación = identificación;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificación() {
        return identificación;
    }

    public void setIdentificación(String identificación) {
        this.identificación = identificación;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
}
