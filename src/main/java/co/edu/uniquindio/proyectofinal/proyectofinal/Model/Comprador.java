package co.edu.uniquindio.proyectofinal.proyectofinal.Model;

import java.util.Date;

public class Comprador extends Persona{

    public Comprador(){
        super();
    };
    public Comprador(String nombre, String apellido,
                      String identificacion, Date fechaNac){
        super(nombre,apellido,identificacion,fechaNac);
    }

}
