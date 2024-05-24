package com.example.pallinachesimuoveperlemedie;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class HelloController extends Thread{
    public Button pulsante;
    @FXML
    private Circle pallina;

    @FXML
    protected void onHelloButtonClick(){
        pallina.setFill(Color.RED);
        start();
    }

    @Override
    public void run(){
        pulsante.setDisable(true);
        pallina.setVisible(false);
        int volta = 0;
        while(volta < 10){
            for(int raggio = 0; raggio < 100; raggio++){
                pallina.setRadius(raggio);
                try{
                    Thread.sleep(1);
                }catch (InterruptedException ignore){}
            }
            for(int raggio = 100; raggio > 0; raggio--){
                pallina.setRadius(raggio);
                try{
                    Thread.sleep(1);
                }catch (InterruptedException ignore){}
            }
            volta++;
        }
        pulsante.setDisable(false);
        pallina.setVisible(true);
    }
}