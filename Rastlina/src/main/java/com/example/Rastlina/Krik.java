package com.example.Rastlina;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class Krik extends Rastlina {

    public Krik(int w, int h, double x, double y, Group root, Scene scene, Color farba) {
        super(w, h, x, y, root, scene, farba);
    }

    public void vykresli() {
        switch (rast) {
            case 0 -> {
                gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                gc.setFill(Color.GREEN);
                gc.fillRect(40, 50, 30, 35);
                gc.setFill(Color.BROWN);
                gc.fillRect(44, 60, 24, 3);
                gc.setFill(Color.BROWN);
                gc.fillRect(44, 70, 24, 3);
            }
            case 1 -> {
                gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                gc.setFill(Color.GREEN);
                gc.fillRect(37, 50 - (rast * 2), 35, 40);
                gc.setFill(Color.BROWN);
                gc.fillRect(41, 60, 29, 3);
                gc.setFill(Color.BROWN);
                gc.fillRect(41, 70, 29, 3);
            }
            case 2 -> {
                gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                gc.setFill(Color.GREEN);
                gc.fillRect(33, 50 - (rast * 3), 40, 45);
                gc.setFill(Color.BROWN);
                gc.fillRect(37, 60, 34, 3);
                gc.setFill(Color.BROWN);
                gc.fillRect(37, 70, 34, 3);
            }
            case 3 -> {
                gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                gc.setFill(Color.GREEN);
                gc.fillRect(30, 50 - (rast * 4), 45, 50);
                gc.setFill(Color.BROWN);
                gc.fillRect(33, 60, 39, 3);
                gc.setFill(Color.BROWN);
                gc.fillRect(33, 70, 39, 3);
            }
            case 4 -> {
                gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                gc.setFill(Color.GREEN);
                gc.fillRect(30, 50 - (rast * 5), 50, 55);
                gc.setFill(Color.BROWN);
                gc.fillRect(33, 55, 45, 3);
                gc.setFill(Color.BROWN);
                gc.fillRect(33, 65, 45, 3);
            }
        }
    }

}
