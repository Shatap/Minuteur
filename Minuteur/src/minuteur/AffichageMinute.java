package minuteur;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

/**
 * Created by oka on 29/10/17.
 */
public class AffichageMinute extends View {
    private MinuteurModele modele ;

    AffichageMinute(MinuteurModele m,MinuteurControleur controleur)
    {
        modele = m;
        stage.setTitle(" MINUTES : ");
        stage.setX(320);
        stage.setY(400);
        incre.setLayoutX(190);
        decre.setLayoutX(0);
        group.getChildren().add(incre);
        TextField DispMinute = new TextField();
        DispMinute.setLayoutX(20);
        DispMinute.setText(Integer.toString(modele.getMinute()));
        group.getChildren().add(DispMinute);
        group.getChildren().add(decre);
        incre.setOnAction((ActionEvent e)->{
            controleur.incMinute(1);
            DispMinute.setText(Integer.toString(modele.getMinute()));
        });
        decre.setOnAction((ActionEvent e)->{
            controleur.incMinute(-1);
            DispMinute.setText(Integer.toString(modele.getMinute()));
        });
        stage.setScene(scene);
        stage.show();
    }



}
