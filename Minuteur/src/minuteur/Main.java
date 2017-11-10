package minuteur;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public void start( Stage PrimaryStage)
    {
        MinuteurModele modele = new MinuteurModele(0,0,0);
        MinuteurControleur controleur = new MinuteurControleur(modele);

        AffHeureMinute affHeureMinute = new AffHeureMinute(modele,controleur);
        AffichageComplet affComp = new AffichageComplet(modele,controleur);
        AffichageMinute affMin = new AffichageMinute(modele,controleur);
        AffichageHeure affHeure = new AffichageHeure(modele,controleur);
        AffichageSeconde affSec = new AffichageSeconde(modele,controleur);
        modele.addObserver(affComp);
        modele.addObserver(affHeureMinute);

    }

    public static void main(String[] args) {
        Application.launch(args);
    }



}
