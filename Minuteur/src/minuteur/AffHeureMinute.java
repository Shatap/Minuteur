/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minuteur;


import javafx.scene.control.TextField;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author ytricha
 */
public class AffHeureMinute extends View implements Observer {
    static TextField MinSec = new TextField();
    private MinuteurModele modele ;

    AffHeureMinute(MinuteurModele m, MinuteurControleur controleur) {
        modele = m;
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


    public  void setChanges(){
        MinSec.setText(Integer.toString(modele.getMinute())+" : " + Integer.toString(modele.getSeconde()));
    }


    @Override
    public void update(Observable o, Object arg) {
    setChanges();
    }
}
