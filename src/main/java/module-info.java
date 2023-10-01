module co.edu.uniquindio.proyectofinal.proyectofinal {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    //requires com.almasb.fxgl.all;
    requires org.mapstruct;

    opens co.edu.uniquindio.proyectofinal.proyectofinal to javafx.fxml;
    exports co.edu.uniquindio.proyectofinal.proyectofinal;
    opens co.edu.uniquindio.proyectofinal.proyectofinal.viewController to javafx.fxml;
    exports co.edu.uniquindio.proyectofinal.proyectofinal.viewController;
    exports co.edu.uniquindio.proyectofinal.proyectofinal.mapping to org.mapstruct;
    opens co.edu.uniquindio.proyectofinal.proyectofinal.mapping;
    exports co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto to org.mapstruct;
}