package co.edu.uniquindio.proyectofinal.proyectofinal.Controller;

import co.edu.uniquindio.proyectofinal.proyectofinal.Controller.Service.ISubastaControlService;

public class SubastaController implements ISubastaControlService {
    ModelFactoryController modelFactoryController;

    public SubastaController() {
        modelFactoryController = ModelFactoryController.getInstance();
    }
    @Override
    public boolean cambiar(){
        return modelFactoryController.actualizarInterfaz();
    }
}