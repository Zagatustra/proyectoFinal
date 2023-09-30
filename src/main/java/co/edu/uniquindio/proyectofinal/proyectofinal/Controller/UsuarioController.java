package co.edu.uniquindio.proyectofinal.proyectofinal.Controller;

import co.edu.uniquindio.proyectofinal.proyectofinal.Controller.Service.IUsuarioService;
import co.edu.uniquindio.proyectofinal.proyectofinal.Model.Usuario;
import co.edu.uniquindio.proyectofinal.proyectofinal.exepcion.UsuarioException;

import java.util.ArrayList;

public class UsuarioController {

        ModelFactoryController modelFactoryController;

        public UsuarioController(){
            modelFactoryController = ModelFactoryController.getInstance();
        }

    }
