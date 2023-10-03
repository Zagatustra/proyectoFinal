package co.edu.uniquindio.proyectofinal.proyectofinal.Controller;

import co.edu.uniquindio.proyectofinal.proyectofinal.Controller.Service.IRegistroService;

import co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto.UsuarioDto;


import java.util.List;

public class RegistroController implements IRegistroService {
    ModelFactoryController modelFactoryController;
    ModelFactoryController modelFactoryController1;
    public RegistroController(){
        modelFactoryController = ModelFactoryController.getInstance();
    }

    //public hola(){  modelFactoryController1=ModelFactoryController.getInstance();}

    public List<UsuarioDto> obtenerUsuario() {
        return modelFactoryController.obtenerUsuario();
    }

    @Override
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
    @Override
    public boolean cambiar(){
        return modelFactoryController.actualizarInterfaz();

        }
}
