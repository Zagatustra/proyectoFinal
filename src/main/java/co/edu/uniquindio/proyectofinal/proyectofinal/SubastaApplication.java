package co.edu.uniquindio.proyectofinal.proyectofinal;

import co.edu.uniquindio.proyectofinal.proyectofinal.viewController.SubastaViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;




import java.io.IOException;

public class SubastaApplication extends Application {
    private Stage primaryStage;
    private BorderPane rootLayout;
    @Override
    public void start(Stage stage) throws IOException {
        this.primaryStage = stage;
        this.primaryStage.setTitle("Subastas UQ");
        mostrarVentanaPrincipal();
    }

    public void mostrarVentanaPrincipal() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(SubastaApplication.class.getResource("main.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            SubastaViewController subastasViewController = loader.getController();
//            subastasViewController.setAplicacion(this);
            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            //scene.getStylesheets().add(getClass().getResource("estilos.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch();
    }
}