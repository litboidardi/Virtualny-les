package com.example.Rastlina;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class Kvet extends Rastlina {

    public Kvet(int w, int h, double x, double y, Group root, Scene scene, Color farba) {
        super(w, h, x, y, root, scene, farba);
    }

    public void vykresli() {
        switch (rast) {
            case 0 -> {
                gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                gc.setFill(Color.GREEN);
                gc.fillRect(40, 90, 5, 70);
                gc.setFill(Color.PURPLE);
                gc.fillOval(35, 85, 13, 13);
                gc.setFill(Color.YELLOW);
                gc.fillOval(38, 88, 8, 8);
            }
            case 1 -> {
                gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                gc.setFill(Color.GREEN);
                gc.fillRect(40, 80, 5, 70);
                gc.setFill(Color.PURPLE);
                gc.fillOval(35-(rast*2), 80 - (rast * 2), 17, 17);
                gc.setFill(Color.YELLOW);
                gc.fillOval(37, 83 - (rast * 2), 10, 10);
            }
            case 2 -> {
                gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                gc.setFill(Color.GREEN);
                gc.fillRect(40, 75, 5, 70);
                gc.setFill(Color.PURPLE);
                gc.fillOval(35-(rast*2), 75 - (rast * 3), 21, 21);
                gc.setFill(Color.YELLOW);
                gc.fillOval(35, 77 - (rast * 2), 14, 14);
            }
            case 3 -> {
                gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                gc.setFill(Color.GREEN);
                gc.fillRect(40, 70, 5, 70);
                gc.setFill(Color.PURPLE);
                gc.fillOval(35-(rast*2), 70 - (rast * 4), 25, 25);
                gc.setFill(Color.YELLOW);
                gc.fillOval(33, 67 - (rast * 2), 18, 18);
                gc.setFill(Color.GREEN);
                gc.fillOval(34, 95 - (rast * 2), 7, 5);
            }
            case 4 -> {
                gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                gc.setFill(Color.GREEN);
                gc.fillRect(40, 65, 5, 70);
                gc.setFill(Color.PURPLE);
                gc.fillOval(35-(rast*2), 65-(rast*3), 29, 29);
                gc.setFill(Color.YELLOW);
                gc.fillOval(32, 65 - (rast * 2), 21, 21);
                gc.setFill(Color.GREEN);
                gc.fillOval(30, 93 - (rast * 2), 11, 8);
            }
        }
    }
}