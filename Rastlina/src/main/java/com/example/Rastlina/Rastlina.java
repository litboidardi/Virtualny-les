package com.example.Rastlina;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class Rastlina extends Canvas {
    GraphicsContext gc;
    Timeline t;
    Group root;
    Scene scene;
    Color farba;
    int rast=-1;

    public Rastlina(int w, int h, double x, double y, Group root, Scene scene, Color farba) {
        super(w,h);
        setLayoutX(x);
        setLayoutY(y);
        this.scene=scene; this.root=root; this.farba=farba;
        gc = this.getGraphicsContext2D();
        //timer, pre rýchlosť rastu
        t = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            vyrast();
            vykresli();
        }));
        t.setCycleCount(Animation.INDEFINITE);
        t.play();
    }
    //metóda, vďaka ktorej objekt dokáže meniť svoju veľkosť
    public void vyrast() {
       rast++;
        if(rast>4) rast=-1; 
    }
    //metóda vykreslujúca objekty, ich tvary a farby sú presne určené v daných podtriedach (Strom, Kvet a Krik)
    public void vykresli(){
    }

}
