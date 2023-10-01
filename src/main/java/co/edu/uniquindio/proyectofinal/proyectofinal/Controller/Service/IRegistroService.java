package co.edu.uniquindio.proyectofinal.proyectofinal.Controller.Service;

import co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto.UsuarioDto;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;


public interface IRegistroService {

    List<UsuarioDto> obtenerUsuario();

    boolean agregarUsuario(UsuarioDto usuarioDto);

    boolean eliminarUsuario(String usuario,String id);

    boolean actualizarUsuario(String cedulaActual, UsuarioDto usuarioDto);
}
