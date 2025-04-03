package com.fernando.workshop;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Workshop JavaFX JDBC");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Método para iniciar a aplicação JavaFX
    }
}

