package co.edu.uniquindio.proyectofinal.proyectofinal.Controller.Service;

import co.edu.uniquindio.proyectofinal.proyectofinal.Model.Usuario;
import co.edu.uniquindio.proyectofinal.proyectofinal.exepcion.UsuarioException;

import java.util.ArrayList;

public interface IUsuarioService {
    public Usuario crearUsuario(String usuario, String contrasena, String email,ArrayList<Usuario> listaUsuarios) throws UsuarioException;

    public Boolean eliminarUsuario(String usuario,ArrayList<Usuario> listaUsuarios) throws UsuarioException;

    boolean actualizarUsuario(String usuarioActual, Usuario usuario,ArrayList<Usuario> listaUsuarios) throws UsuarioException;


    boolean verificarUsuarioExistente(String usu,ArrayList<Usuario> listaUsuarios) throws UsuarioException;

    //Usuario obtenerUsuario(String usu,ArrayList<Usuario> listaUsuarios);

}
