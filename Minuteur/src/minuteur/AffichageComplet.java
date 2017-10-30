package minuteur;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AffichageComplet {
    Stage stage = new Stage();
    Group group = new Group();
    Scene scene = new Scene(group,220,30);
    static TextField DispTot = new TextField();
    static Minuteur minuteur;


    AffichageComplet()
    {
        stage.setTitle("Minuteur");
        stage.setX(300);
        stage.setY(600);
        DispTot.setLayoutX(30);
        DispTot.setText(Integer.toString(minuteur.modele.getHeure()) +
                   " : " + Integer.toString(minuteur.modele.getMinute()) +
                   " : " + Integer.toString(minuteur.modele.getSeconde()) );
        group.getChildren().add(DispTot);
        stage.setScene(scene);
        stage.show();
    }
    public static void setChanges(){
        DispTot.setText(Integer.toString(minuteur.modele.getHeure()) + " : " + Integer.toString(minuteur.modele.getMinute())+" : " + Integer.toString(minuteur.modele.getSeconde()));
    }
}
