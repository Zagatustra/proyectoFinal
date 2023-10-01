package co.edu.uniquindio.proyectofinal.proyectofinal.Controller;

import co.edu.uniquindio.proyectofinal.proyectofinal.Controller.Service.IRegistroService;

import co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto.UsuarioDto;


import java.util.List;

public class RegistroController implements IRegistroService {
    ModelFactoryController modelFactoryController;
    public RegistroController(){
        modelFactoryController = ModelFactoryController.getInstance();
    }

    @Override
    public List<UsuarioDto> obtenerUsuario() {
        return modelFactoryController.obtenerUsuario();
    }

    public boolean agregarUsuario(UsuarioDto usuarioDto) {
        return modelFactoryController.agregarUsuario(usuarioDto);
    }

    @Override
    public boolean eliminarUsuario(String usuario, String id) {
        return false;
    }

    @Override
    public boolean actualizarUsuario(String cedulaActual, UsuarioDto usuarioDto) {
        return false;
    }
}
