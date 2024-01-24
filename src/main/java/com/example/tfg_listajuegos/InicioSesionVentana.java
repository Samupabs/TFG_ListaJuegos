package com.example.tfg_listajuegos;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class InicioSesionVentana {

    @FXML
    private Button BTN_Registrarse; //

    // Cambiar a ventana registro
    @FXML
    public void cambiarVentanaRegistro() {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("registro-ventana.fxml"));
            Parent root = loader.load();

            // Configurar la escena
            Scene scene = new Scene(root);
            Stage stage = (Stage) BTN_Registrarse.getScene().getWindow(); // Obtener la ventana actual usando el botón
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
