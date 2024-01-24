module com.example.tfg_listajuegos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tfg_listajuegos to javafx.fxml;
    exports com.example.tfg_listajuegos;
}