package minuteur;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;


/**
 * Created by oka on 29/10/17.
 */
public class AffichageHeure extends View  {

    private MinuteurModele modele ;

    AffichageHeure(MinuteurModele m,MinuteurControleur controleur){
        modele = m;
        stage.setX(100);
        stage.setY(400);
        stage.setTitle("HEURES :");
        incre.setLayoutX(190);
        decre.setLayoutX(0);
        group.getChildren().add(incre);
        TextField DispHeure = new TextField();
        DispHeure.setLayoutX(20);
        DispHeure.setText(Integer.toString(modele.getHeure()));
        group.getChildren().add(DispHeure);
        group.getChildren().add(decre);
        incre.setOnAction((ActionEvent e)->{
            controleur.incHeure(1);
            DispHeure.setText(Integer.toString(modele.getHeure()));
        });
        decre.setOnAction((ActionEvent e)->{
            controleur.incHeure(-1);
            DispHeure.setText(Integer.toString(modele.getHeure()));
        });
        stage.setScene(scene);
        stage.show();
    }




}
