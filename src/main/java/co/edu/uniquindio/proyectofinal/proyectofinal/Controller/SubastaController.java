package co.edu.uniquindio.proyectofinal.proyectofinal.Controller;

import co.edu.uniquindio.proyectofinal.proyectofinal.Controller.Service.ISubastaService;
import co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto.UsuarioDto;

import java.util.List;

public class SubastaController implements ISubastaService {
    ModelFactoryController modelFactoryController;

    public SubastaController(){
        modelFactoryController = ModelFactoryController.getInstance();
    }

}
