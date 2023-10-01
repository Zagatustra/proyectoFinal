package co.edu.uniquindio.proyectofinal.proyectofinal.viewController;
import javafx.fxml.FXML;
import co.edu.uniquindio.proyectofinal.proyectofinal.Controller.SubastaController;
import co.edu.uniquindio.proyectofinal.proyectofinal.Controller.Service.ISubastaControlService;

public class SubastaViewController {
    ISubastaControlService subastaControllerService;

    @FXML
    void initialize() {
        subastaControllerService = new SubastaController();
    }
}
