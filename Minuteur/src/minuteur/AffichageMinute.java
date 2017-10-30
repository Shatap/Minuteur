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
public class AffichageMinute extends Minuteur {

    Stage stage = new Stage();
    Group group = new Group();
    Scene scene = new Scene(group,220,30);

    Button incre= new Button("+");
    Button decre = new Button("-");
    AffichageMinute(MinuteurModele modele,MinuteurControleur controleur)
    {

        stage.setTitle("Affichage Minute");
        stage.setX(300);
        incre.setLayoutX(190);
        decre.setLayoutX(0);
        group.getChildren().add(incre);
        TextField DispMinute = new TextField();
        DispMinute.setLayoutX(20);
        DispMinute.setText(Integer.toString(modele.getMinute()));
        group.getChildren().add(DispMinute);
        group.getChildren().add(decre);
        incre.setOnAction((ActionEvent e)->{controleur.incMinute(1);DispMinute.setText(Integer.toString(modele.getMinute()));});
        decre.setOnAction((ActionEvent e)->{controleur.incMinute(-1);DispMinute.setText(Integer.toString(modele.getMinute()));});
        stage.setScene(scene);
        stage.show();
    }



}
