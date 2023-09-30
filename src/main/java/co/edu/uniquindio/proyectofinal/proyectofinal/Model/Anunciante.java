package co.edu.uniquindio.proyectofinal.proyectofinal.Model;

import java.util.Date;

public class Anunciante extends Persona{

    public Anunciante(){
        super();
    };
    public Anunciante(String nombre, String apellido,
                      String identificacion, Date fechaNac){
        super(nombre,apellido,identificacion,fechaNac);
    }
}
