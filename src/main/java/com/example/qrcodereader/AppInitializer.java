package com.example.qrcodereader;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("MainForm.fxml"))));
        primaryStage.show();
        primaryStage.setTitle("QR Code Reader");
        primaryStage.setOnCloseRequest(event -> {
                   Platform.exit();
                   System.exit(0);
        });
    }
}
