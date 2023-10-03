package co.edu.uniquindio.proyectofinal.proyectofinal.Controller.Service;

import co.edu.uniquindio.proyectofinal.proyectofinal.Model.Usuario;
import co.edu.uniquindio.proyectofinal.proyectofinal.exepcion.UsuarioException;
import co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto.UsuarioDto;

import java.util.ArrayList;
import java.util.List;

public interface ISubastaControlService {
    List<UsuarioDto> obtenerUsuario();

    boolean agregarUsuario(UsuarioDto usuarioDto);

    boolean eliminarUsuario(String usuario,String id);

    boolean actualizarUsuario(String cedulaActual, UsuarioDto usuarioDto);

    boolean cambiar();


}