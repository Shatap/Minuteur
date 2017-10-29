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
public class AffichageHeure extends Minuteur {

    AffichageHeure(MinuteurModele modele, MinuteurControleur controleur){
        Stage stage = new Stage();
        Group group = new Group();
        Scene scene = new Scene(group,220,30);
        stage.setTitle("Affichage Heure");
        Button incre= new Button("+");
        Button decre = new Button("-");

        incre.setLayoutX(190);
        decre.setLayoutX(0);
        group.getChildren().add(incre);
        TextField DispHeure = new TextField();
        DispHeure.setLayoutX(20);
        DispHeure.setText(Integer.toString(modele.getHeure()));
        group.getChildren().add(DispHeure);
        group.getChildren().add(decre);
        incre.setOnAction((ActionEvent e)->{controleur.incHeure(1);DispHeure.setText(Integer.toString(modele.getHeure()));});
        decre.setOnAction((ActionEvent e)->{controleur.incHeure(-1);DispHeure.setText(Integer.toString(modele.getHeure()));});
        stage.setScene(scene);
        stage.show();


    }

}
