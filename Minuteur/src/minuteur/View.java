package minuteur;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class View extends Application {
    public void start( Stage PrimaryStage)
    {
        Observer observer = new Observer();
        Minuteur minuteur = new Minuteur();
        AffichageComplet affComp = new AffichageComplet();
        AffichageMinute affMin = new AffichageMinute(minuteur,observer);
        AffichageHeure affHeure = new AffichageHeure(minuteur,observer);
        AffichageSeconde affSec = new AffichageSeconde(minuteur,observer);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }



}
