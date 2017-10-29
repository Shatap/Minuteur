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
public class Minuteur extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start( Stage PrimaryStage)
    {
        MinuteurModele modele = new MinuteurModele(0,0,0);
        MinuteurControleur controleur = new MinuteurControleur(modele);

        AffichageHeure affHeure = new AffichageHeure(modele,controleur);
        AffichageMinute affMinute = new AffichageMinute(modele,controleur);






        Stage stage = new Stage();
        Group group = new Group();
        Scene scene = new Scene(group,220,60);
        stage.setTitle("Minuteur");

        

        TextField DispHeure = new TextField();
        TextField DispMinute = new TextField();
        DispHeure.setMaxSize(50,40);
        DispHeure.setLayoutX(20);

        DispHeure.setText(Integer.toString(modele.getHeure())+" : " + Integer.toString(modele.getMinute()));
        group.getChildren().add(DispHeure);

        stage.setScene(scene);
        stage.show();


    }

}
