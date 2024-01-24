package com.example.tfg_listajuegos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {


        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("inicio-sesion.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root); //Tamaño de la ventana

        stage.setTitle("GoodGamer");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}