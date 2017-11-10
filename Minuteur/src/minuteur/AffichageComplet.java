package minuteur;

import javafx.scene.control.TextField;

import java.util.Observable;
import java.util.Observer;


public class AffichageComplet  extends View  implements Observer {
    private static TextField DispTot = new TextField();
    private MinuteurModele modele ;
    AffichageComplet(MinuteurModele m,MinuteurControleur controleur)
    {
        modele = m;
        stage.setTitle("AffHeureMinute");
        stage.setX(300);
        stage.setY(600);
        DispTot.setLayoutX(30);
        DispTot.setText(Integer.toString(modele.getHeure()) +
                " : " + Integer.toString(modele.getMinute()) +
                " : " + Integer.toString(modele.getSeconde()) );
        group.getChildren().add(DispTot);
        stage.setScene(scene);
        stage.show();
    }

    public  void setChanges(){
        DispTot.setText(Integer.toString(modele.getHeure()) + " : " + Integer.toString(modele.getMinute())+" : " + Integer.toString(modele.getSeconde()));
    }

    @Override
    public void update(Observable o, Object arg) {
        setChanges();

    }
}

