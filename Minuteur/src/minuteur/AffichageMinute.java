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
public class AffichageMinute  {
    Stage stage = new Stage();
    Group group = new Group();
    Scene scene = new Scene(group,220,30);
    Button incre= new Button("+");
    Button decre = new Button("-");
    AffichageMinute(Minuteur minuteur , Observer observer)
    {
        stage.setTitle(" MINUTES : ");
        stage.setX(320);
        stage.setY(400);
        incre.setLayoutX(190);
        decre.setLayoutX(0);
        group.getChildren().add(incre);
        TextField DispMinute = new TextField();
        DispMinute.setLayoutX(20);
        DispMinute.setText(Integer.toString(minuteur.modele.getMinute()));
        group.getChildren().add(DispMinute);
        group.getChildren().add(decre);
        incre.setOnAction((ActionEvent e)->{minuteur.controleur.incMinute(1);DispMinute.setText(Integer.toString(minuteur.modele.getMinute()));observer.NotiferTout();});
        decre.setOnAction((ActionEvent e)->{minuteur.controleur.incMinute(-1);DispMinute.setText(Integer.toString(minuteur.modele.getMinute()));observer.NotiferTout();});
        stage.setScene(scene);
        stage.show();
    }



}
