/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minuteur;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.EventListener;

/**
 *
 * @author ytricha
 */
public class Minuteur {
    static TextField MinSec = new TextField();
    static  MinuteurModele modele = new MinuteurModele(0,0,0);
    MinuteurControleur controleur = new MinuteurControleur(modele);

    Stage stage = new Stage();
    Group group = new Group();
    Scene scene = new Scene(group,220,30);

    Minuteur() {
        stage.setX(300);
        stage.setY(200);

        stage.setTitle("Minutes : Secondes");
        MinSec.setMaxSize(90,40);
        MinSec.setLayoutX(60);
        MinSec.setText(Integer.toString(modele.getHeure())+" : " + Integer.toString(modele.getMinute()));
        group.getChildren().add(MinSec);
        stage.setScene(scene);
        stage.show();
    }


    public static void setChanges(){
        MinSec.setText(Integer.toString(modele.getMinute())+" : " + Integer.toString(modele.getSeconde()));
    }



   

}
