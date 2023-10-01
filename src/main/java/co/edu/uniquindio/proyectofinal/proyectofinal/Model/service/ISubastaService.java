package co.edu.uniquindio.proyectofinal.proyectofinal.Model.service;

import co.edu.uniquindio.proyectofinal.proyectofinal.Model.Usuario;
import co.edu.uniquindio.proyectofinal.proyectofinal.exepcion.UsuarioException;

import java.util.ArrayList;

public interface ISubastaService {
    Usuario crearUsuario(String usuario, String contrasena, String email, ArrayList<Usuario> listaUsuarios) throws UsuarioException;

    Boolean eliminarUsuario(String cedula, ArrayList<Usuario> listaUsuarios) throws UsuarioException;

    boolean actualizarUsuario(String usuarioActual, Usuario usuario) throws UsuarioException;

    boolean verificarUsuarioExistente(String usu) throws UsuarioException;

    Usuario obtenerUsuario(String usu, ArrayList<Usuario> listaUsuarios);

    boolean usuarioExiste(String usu);
}
