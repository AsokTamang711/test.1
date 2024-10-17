module com.example.asoktmg11 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.asoktmg11 to javafx.fxml;
    exports com.example.asoktmg11;
}