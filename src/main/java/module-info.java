module org.example.prueba {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.prueba to javafx.fxml;
    exports org.example.prueba;
}