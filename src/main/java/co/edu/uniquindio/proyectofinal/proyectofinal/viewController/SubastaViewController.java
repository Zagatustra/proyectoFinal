package co.edu.uniquindio.proyectofinal.proyectofinal.viewController;

import co.edu.uniquindio.proyectofinal.proyectofinal.Controller.RegistroController;
import co.edu.uniquindio.proyectofinal.proyectofinal.Controller.Service.IRegistroService;

import co.edu.uniquindio.proyectofinal.proyectofinal.SubastaApplication;
import co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto.AnuncianteDto;
import co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto.CompradorDto;
import co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto.UsuarioDto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class SubastaViewController {
    IRegistroService registroControllerService;


    @FXML
    private AnchorPane panel;
    @FXML
    private ResourceBundle resources;
    ObservableList<UsuarioDto> listaUsuarioDto= FXCollections.observableArrayList();
    ObservableList<AnuncianteDto> listaAnuncianteDto= FXCollections.observableArrayList();
    ObservableList<CompradorDto> listaCompradorDto= FXCollections.observableArrayList();
    @FXML
    private URL location;
    @FXML
    private TextField txtUsuarioReg;
    @FXML
    private TextField txtContrasenaReg;
    @FXML
    private TextField txtEmailReg;
    @FXML
    private TextField txtNombreReg;
    @FXML
    private TextField txtApellidoReg;
    @FXML
    private TextField txtIdentificacionReg;
    @FXML
    private Button btnRegistro;
    private TableView<UsuarioDto> tableUsuario;
    @FXML
    private TableColumn<UsuarioDto, String> tcNombre;

    @FXML
    private TableColumn<UsuarioDto, String> tcApellido;

    @FXML
    private TableColumn<UsuarioDto, String> tcIdentificacion;

    @FXML
    private TableColumn<UsuarioDto, String> tcFechaNacimiento;
    @FXML
    private TableColumn<UsuarioDto, String> tcUsuario;

    @FXML
    private TableColumn<UsuarioDto, String> tcContrasena;

    @FXML
    private TableColumn<UsuarioDto, String> tcEmail;





    @FXML
    void initialize() {

        registroControllerService = new RegistroController();

        intiView();

    }
   /* private void initDataBinding() {
        tcNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().anunRelacionado().nombre()));
        tcApellido.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().anunRelacionado().apellido()));
        tcIdentificacion.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().anunRelacionado().identificacion()));
        tcFechaNacimiento.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().anunRelacionado().fechaNac()));

        tcUsuario.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().usuario())));
        tcContrasena.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().contrasena()));
        tcEmail.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().email()));
    }*/

    private void obtenerUsuario() {
        listaUsuarioDto.addAll(registroControllerService.obtenerUsuario());
    }


    /*private void listenerSelection() {
        tableUsuario.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            usuarioSelecionado = newSelection;
            mostrarInformacionEmpleado(usuarioSelecionado);
        });
    }*/

    private void intiView() {
        //initDataBinding();
        obtenerUsuario();
        //tableUsuario.getItems().clear();
        //tableUsuario.setItems(listaUsuarioDto);
        //listenerSelection();


    }

    @FXML void nuevoUsuarioAction(ActionEvent event) throws IOException {
        crearUsuario();
    }

    private boolean crearUsuario() throws IOException {
        //1. Capturar los datos
        UsuarioDto usuarioDto = construirUsuarioDto();
        AnuncianteDto anuncianteDto = construirAnuncianteDto();
        //2. Validar la información
        if (datosValidos(usuarioDto,anuncianteDto)){
            if (registroControllerService.agregarUsuario(usuarioDto)) {
                listaUsuarioDto.add(usuarioDto);
                mostrarMensaje("Notificación usuario", "Usuario creado",
                        "El usuario se ha creado con éxito. \n Bienvenido. ", Alert.AlertType.INFORMATION);
                limpiarCamposEmpleado();
                cambiarI(registroControllerService.cambiar());
                return true;
            } else {
                mostrarMensaje("Notificación empleado", "Empleado no creado", "El empleado no se ha creado con éxito", Alert.AlertType.ERROR);
                return false;
            }
        } else {
            mostrarMensaje("Notificación empleado", "Empleado no creado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
        return false;
        }
    }
    private UsuarioDto construirUsuarioDto () {
            return  new UsuarioDto(
                    txtUsuarioReg.getText(),
                    txtContrasenaReg.getText(),
                    txtEmailReg.getText());
    }

    private AnuncianteDto construirAnuncianteDto () {
        return  new AnuncianteDto(
                txtNombreReg.getText(),
                txtApellidoReg.getText(),
                txtIdentificacionReg.getText(),
        null);
    }
    private boolean datosValidos(UsuarioDto usuarioDto,AnuncianteDto anuncianteDto) {
        String mensaje = "";
        if (usuarioDto.usuario() == null || usuarioDto.usuario().equals(""))
            mensaje += "El usuario es invalido \n";
        if (usuarioDto.contrasena() == null || usuarioDto.contrasena().equals(""))
            mensaje += "El contraseña es invalido \n";
        if (usuarioDto.email() == null || usuarioDto.email().equals(""))
            mensaje += "El email es invalido \n";


        if (anuncianteDto.nombre() == null || anuncianteDto.nombre().equals(""))
            mensaje += "La nombre es invalida \n";
        if (anuncianteDto.apellido() == null || anuncianteDto.apellido().equals(""))
            mensaje += "La apellido es invalida \n";
        if (anuncianteDto.identificacion() == null || anuncianteDto.identificacion().equals(""))
            mensaje += "La identificacion es invalida \n";
        if (mensaje.equals("")) {
            return true;
        } else {
            mostrarMensaje("Notificación cliente", "Datos invalidos", mensaje, Alert.AlertType.WARNING);
            return false;
        }
    }
        private void mostrarMensaje(String titulo, String header, String contenido, Alert.AlertType alertType){
            Alert aler = new Alert(alertType);
            aler.setTitle(titulo);
            aler.setHeaderText(header);
            aler.setContentText(contenido);
            aler.showAndWait();
        }
    private boolean mostrarMensajeConfirmacion(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setTitle("Confirmación");
        alert.setContentText(mensaje);
        Optional<ButtonType> action = alert.showAndWait();
        if (action.get() == ButtonType.OK) {
            return true;
        } else {
            return false;
        }
    }
    private void limpiarCamposEmpleado() {
        txtNombreReg.setText("");
        txtApellidoReg.setText("");
        txtIdentificacionReg.setText("");
        txtUsuarioReg.setText("");
        txtContrasenaReg.setText("");
        txtEmailReg.setText("");

    }
    private void cambiarI(boolean desicion) throws IOException {
        if(desicion){
            panel.requestFocus();
            panel.getChildren().clear();

            try{
                FXMLLoader loader= new FXMLLoader();
                loader.setLocation(SubastaApplication.class.getResource("main2.fxml"));
                AnchorPane panelN= loader.load();
                panel.getChildren().add(panelN);

            }catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
