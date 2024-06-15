module com.example.proyectofinal {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.example.proyectofinal to javafx.fxml;
    exports com.example.proyectofinal;
}