package com.example.Rastlina;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
       Group root = new Group();
        Scene scene = new Scene(root, 600, 400, Color.GREENYELLOW);
        VBox hbo = new VBox();

        //tlačítka na vytváranie objektov
        Button stromcek = new Button("STROM");
        stromcek.setOnAction(actionEvent -> {
            double x = Math.random()*(scene.getWidth()-10);
            double y = Math.random()*(scene.getHeight()-10);
            Strom strom = new Strom(100,100,x,y,root,scene, Color.GREEN);
            root.getChildren().add(strom);
        });
        Button kvetinka = new Button("KVET");
        kvetinka.setOnAction(actionEvent -> {
            double x = Math.random()*(scene.getWidth()-10);
            double y = Math.random()*(scene.getHeight()-10);
            Kvet kvet = new Kvet(100,100,x,y,root,scene, Color.GREEN);
            root.getChildren().add(kvet);
        });
        Button kricek = new Button("KRÍK");
        kricek.setOnAction(actionEvent -> {
            double x = Math.random()*(scene.getWidth()-10);
            double y = Math.random()*(scene.getHeight()-10);
            Krik krik = new Krik(100,100,x,y,root,scene, Color.GREEN);
            root.getChildren().add(krik);
        });
        hbo.getChildren().addAll(stromcek, kvetinka, kricek);
        root.getChildren().add(hbo);

        stage.setTitle("Virtuálny les");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}