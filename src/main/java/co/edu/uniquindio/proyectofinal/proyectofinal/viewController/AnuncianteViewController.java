package co.edu.uniquindio.proyectofinal.proyectofinal.viewController;

import co.edu.uniquindio.proyectofinal.proyectofinal.Controller.AnuncianteController;
import co.edu.uniquindio.proyectofinal.proyectofinal.Controller.Service.IAnuncianteControllerService;
import co.edu.uniquindio.proyectofinal.proyectofinal.Controller.UsuarioController;
import javafx.fxml.FXML;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;

public class AnuncianteViewController {
     AnuncianteController anuncianteControllerService;

    @FXML
    void initialize() {
        anuncianteControllerService=new AnuncianteController();
    }



}
