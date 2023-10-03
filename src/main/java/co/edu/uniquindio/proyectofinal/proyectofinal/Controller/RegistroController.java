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




}
