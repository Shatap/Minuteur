package minuteur;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;



public class AffichageSeconde extends View   {
    private MinuteurModele modele ;

    AffichageSeconde(MinuteurModele m,MinuteurControleur controleur )
    {
        modele = m;
        stage.setTitle("SECONDES : ");
        stage.setX(540);
        stage.setY(400);
        incre.setLayoutX(190);
        decre.setLayoutX(0);
        group.getChildren().add(incre);
        TextField DispMinute = new TextField();
        DispMinute.setLayoutX(20);
        DispMinute.setText(Integer.toString(modele.getSeconde()));
        group.getChildren().add(DispMinute);
        group.getChildren().add(decre);

        incre.setOnAction((ActionEvent e)->{
            controleur.incSeconde(1);
            DispMinute.setText(Integer.toString(modele.getSeconde()));
        });

        decre.setOnAction((ActionEvent e)->{controleur.incSeconde(-1);
            DispMinute.setText(Integer.toString(modele.getSeconde()));
        });
        stage.setScene(scene);
        stage.show();
    }


}
