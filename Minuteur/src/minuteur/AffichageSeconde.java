package minuteur;

import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class AffichageSeconde {
    Stage stage = new Stage();
    Group group = new Group();
    Scene scene = new Scene(group,220,30);
    Button incre= new Button("+");
    Button decre = new Button("-");
    AffichageSeconde(Minuteur minuteur , Observer observer)
    {
        stage.setTitle("SECONDES : ");
        stage.setX(540);
        stage.setY(400);
        incre.setLayoutX(190);
        decre.setLayoutX(0);
        group.getChildren().add(incre);
        TextField DispMinute = new TextField();
        DispMinute.setLayoutX(20);
        DispMinute.setText(Integer.toString(minuteur.modele.getSeconde()));
        group.getChildren().add(DispMinute);
        group.getChildren().add(decre);
        incre.setOnAction((ActionEvent e)->{minuteur.controleur.incSeconde(1);DispMinute.setText(Integer.toString(minuteur.modele.getSeconde()));observer.NotiferTout();});
        decre.setOnAction((ActionEvent e)->{minuteur.controleur.incSeconde(-1);DispMinute.setText(Integer.toString(minuteur.modele.getSeconde()));observer.NotiferTout();});
        stage.setScene(scene);
        stage.show();
    }
}
