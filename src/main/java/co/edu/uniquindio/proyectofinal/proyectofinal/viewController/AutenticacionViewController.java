package co.edu.uniquindio.proyectofinal.proyectofinal.viewController;

import co.edu.uniquindio.proyectofinal.proyectofinal.Controller.AutenticacionController;
import co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto.UsuarioDto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class AutenticacionViewController {

    AutenticacionController autenticacionControllService;

    ObservableList<UsuarioDto> listaEmpleadosDto = FXCollections.observableArrayList();
    UsuarioDto empleadoSeleccionado;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtContrasena;

    @FXML
    private RadioButton rdoBtnAnunciante;
    @FXML
    private RadioButton rdoBtnComprador;
    @FXML
    private Button btnAcceder;

    ToggleGroup toggleGroup = new ToggleGroup();
    //rdoBtnAnunciante.setToggleGroup(toggleGroup);
    //rdoBtnComprador.setToggleGroup(toggleGroup);

}
