package minuteur;

import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Created by oka on 29/10/17.
 */
public class AffichageHeure  {

    AffichageHeure(Minuteur minuteur , Observer observer){
        Stage stage = new Stage();
        stage.setX(100);
        stage.setY(400);
        Group group = new Group();
        Scene scene = new Scene(group,220,30);
        stage.setTitle("HEURES :");
        Button incre= new Button("+");
        Button decre = new Button("-");

        incre.setLayoutX(190);
        decre.setLayoutX(0);
        group.getChildren().add(incre);
        TextField DispHeure = new TextField();
        DispHeure.setLayoutX(20);
        DispHeure.setText(Integer.toString(minuteur.modele.getHeure()));
        group.getChildren().add(DispHeure);
        group.getChildren().add(decre);
        incre.setOnAction((ActionEvent e)->{minuteur.controleur.incHeure(1);DispHeure.setText(Integer.toString(minuteur.modele.getHeure()));observer.NotiferTout();});
        decre.setOnAction((ActionEvent e)->{minuteur.controleur.incHeure(-1);DispHeure.setText(Integer.toString(minuteur.modele.getHeure()));observer.NotiferTout();});
        stage.setScene(scene);
        stage.show();


    }

}
