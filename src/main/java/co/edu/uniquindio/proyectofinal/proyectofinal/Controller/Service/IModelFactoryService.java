package co.edu.uniquindio.proyectofinal.proyectofinal.Controller.Service;

import co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto.AnuncianteDto;
import co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyectofinal.proyectofinal.Model.Usuario;

import java.util.ArrayList;
import java.util.List;


public interface IModelFactoryService {
    List<UsuarioDto> obtenerUsuario();


    boolean agregarUsuario(UsuarioDto usuarioDto);

    boolean agregarAnunciante(AnuncianteDto anuncianteDto);

    //boolean agrergarUsuario(Usuario usuario);
    boolean eliminarUsuario(String usuario);

    boolean actualizarUsuario(String usuario, UsuarioDto usuarioDto);

    boolean actualizarInterfaz();
}
