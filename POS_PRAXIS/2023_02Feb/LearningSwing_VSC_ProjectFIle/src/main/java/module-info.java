module swing {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires java.desktop;

    opens opennewwindow to javafx.fxml;
    exports opennewwindow;
}
