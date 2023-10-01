package co.edu.uniquindio.proyectofinal.proyectofinal.Model;

import co.edu.uniquindio.proyectofinal.proyectofinal.Controller.Service.IUsuarioService;
import co.edu.uniquindio.proyectofinal.proyectofinal.exepcion.UsuarioException;
import co.edu.uniquindio.proyectofinal.proyectofinal.Controller.SubastaController;
import co.edu.uniquindio.proyectofinal.proyectofinal.Controller.UsuarioController;
import co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto.UsuarioDto;

import java.util.ArrayList;

public class Usuario implements IUsuarioService {

    private String usuario;
    private String contrasena;
    private String email;

    private Anunciante anunRelacionado;
    private Comprador compRelacionado;

    public Usuario(){};

    public Usuario(String usuario, String contrasena, String email,
                   Anunciante anunRelacionado, Comprador compRelacionado) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.email = email;
        this.anunRelacionado=anunRelacionado;
        this.compRelacionado=compRelacionado;
    }


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Anunciante getAnunRelacionado() {
        return anunRelacionado;
    }

    public void setAnunRelacionado(Anunciante anunRelacionado) {
        this.anunRelacionado = anunRelacionado;
    }

    public Comprador getCompRelacionado() {
        return compRelacionado;
    }

    public void setCompRelacionado(Comprador compRelacionado) {
        this.compRelacionado = compRelacionado;
    }




}
