package com.Teamcalc.fx;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Teamapp extends Application {

    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane(new Label("Hello JavaFX World!"));

        Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
        Scene scene = new Scene(root, visualBounds.getWidth(), visualBounds.getHeight());

        stage.getIcons().add(new Image(Teamapp.class.getResourceAsStream("/icon.png")));
        stage.setScene(scene);
        stage.show();
    }
}
