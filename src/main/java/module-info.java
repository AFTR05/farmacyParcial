module com.example.farmacy2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.farmacy2 to javafx.fxml;
    exports com.example.farmacy2;
}