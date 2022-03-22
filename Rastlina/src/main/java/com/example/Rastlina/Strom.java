package com.example.Rastlina;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class Strom extends Rastlina{

    public Strom(int w, int h, double x, double y, Group root, Scene scene, Color farba) {
        super(w, h, x, y, root, scene, farba);
    }

    public void vykresli(){
        switch (rast) {
            case 0 -> {
                gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                gc.setFill(Color.BROWN);
                gc.fillRect(50, 70, 5, 60);
                gc.setFill(Color.GREEN);
                gc.fillOval(39, 50, 30, 30);
            }
            case 1 -> {
                gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                gc.setFill(Color.BROWN);
                gc.fillRect(50, 70, 5, 60);
                gc.setFill(Color.GREEN);
                gc.fillOval(37, 50 - (rast * 2), 35, 35);
            }
            case 2 -> {
                gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                gc.setFill(Color.BROWN);
                gc.fillRect(50, 70, 5, 60);
                gc.setFill(Color.GREEN);
                gc.fillOval(33, 50 - (rast * 3), 40, 40);
            }
            case 3 -> {
                gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                gc.setFill(Color.BROWN);
                gc.fillRect(50, 70, 7, 60);
                gc.setFill(Color.GREEN);
                gc.fillOval(33, 50 - (rast * 4), 45, 45);
            }
            case 4 -> {
                gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                gc.setFill(Color.BROWN);
                gc.fillRect(50, 70, 7, 60);
                gc.setFill(Color.GREEN);
                gc.fillOval(31, 50 - (rast*5), 50, 50);
            }
        }

    }
}
